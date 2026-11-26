package com.caiofreitas.library.repositories;

import com.caiofreitas.library.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
