package com.caiofreitas.library.dtos;

public class BookResponseDTO {

    private Long id;

    private String title;

    private String isbn;

    private Integer yearOfPublication;

    private Integer totalQuantity;

    private Integer availableQuantity;

    private String autorName;

    public BookResponseDTO(Long id, String isbn, String title, Integer yearOfPublication, Integer totalQuantity, Integer availableQuantity, String autorName) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.totalQuantity = totalQuantity;
        this.availableQuantity = availableQuantity;
        this.autorName = autorName;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public String getAutorName() {
        return autorName;
    }
}
