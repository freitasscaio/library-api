package com.caiofreitas.library.dtos;

import com.caiofreitas.library.models.LoanStatus;

import java.time.LocalDate;

public class LoanResponseDTO {

    private Long id;

    private String bookTitle;

    private String readerName;

    private LocalDate loanDate;

    private LocalDate expectedReturnDate;

    private LocalDate returnDate;

    private LoanStatus loanStatus;

    private Double fine;

    public LoanResponseDTO(Long id, String bookTitle, String readerName,
                           LocalDate loanDate, LocalDate expectedReturnDate,
                           LocalDate returnDate, LoanStatus loanStatus, Double fine) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.readerName = readerName;
        this.loanDate = loanDate;
        this.expectedReturnDate = expectedReturnDate;
        this.returnDate = returnDate;
        this.loanStatus = loanStatus;
        this.fine = fine;
    }

    public Double getFine() {
        return fine;
    }

    public Long getId() {
        return id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getReaderName() {
        return readerName;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }
}
