package com.caiofreitas.library.dtos;

import jakarta.validation.constraints.NotBlank;

public class AutorRequestDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
