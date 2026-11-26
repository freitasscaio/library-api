package com.caiofreitas.library.dtos;

public class AutorResponseDTO {

    private Long id;

    private String name;

    private String nationality;

    public AutorResponseDTO(Long id, String name, String nationality) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
    }

    public Long getId() {
        return id;
    }

    public String getNationality() {
        return nationality;
    }

    public String getName() {
        return name;
    }
}
