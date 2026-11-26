package com.caiofreitas.library.models;

import com.caiofreitas.library.services.exceptions.BusinessException;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table (name = "tb_book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @Column(unique = true)
    private String isbn;

    private Integer yearOfPublication;

    private Integer totalQuantity;

    private Integer availableQuantity;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @OneToMany(mappedBy = "book")
    private List<Loan> loans = new ArrayList<>();

    public Book(){
    }

    public Book(Long id, String title, String isbn, Integer yearOfPublication, Integer totalQuantity, Integer availableQuantity, Autor autor) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.yearOfPublication = yearOfPublication;
        this.totalQuantity = totalQuantity;
        this.availableQuantity = availableQuantity;
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public boolean isAvailable(){
        return availableQuantity > 0;
    }

    public void removeCopy(){
        if(!isAvailable()){
                throw new BusinessException("Livro indisponível");
        }

        availableQuantity = availableQuantity -1;
    }

    public void returnCopy(){
        availableQuantity = availableQuantity + 1;
    }

}
