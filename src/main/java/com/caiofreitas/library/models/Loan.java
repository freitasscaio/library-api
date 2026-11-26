package com.caiofreitas.library.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table (name = "tb_loan")
public class Loan implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String readerName;

    private LocalDate loanDate;

    private LocalDate expectedReturnDate;

    private LocalDate returnDate;

    @Enumerated(EnumType.STRING)
    private LoanStatus loanStatus;

    @ManyToOne
    @JoinColumn (name = "book_id")
    private Book book;

    public Loan(){
    }

    public Loan(LoanStatus loanStatus, LocalDate returnDate, LocalDate expectedReturnDate, String readerName, LocalDate loanDate, Long id, Book book) {
        this.loanStatus = loanStatus;
        this.returnDate = returnDate;
        this.expectedReturnDate = expectedReturnDate;
        this.readerName = readerName;
        this.loanDate = loanDate;
        this.id = id;
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(LocalDate expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return Objects.equals(id, loan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public boolean isLate(){
        return loanStatus == LoanStatus.ACTIVE && LocalDate.now().isAfter(expectedReturnDate);
    }

    public Double calculateFine(){
        Long days = ChronoUnit.DAYS.between(expectedReturnDate, returnDate);
        if(days > 0){
            return (double) (days * 2);
        }
        return 0.0;
    }

}
