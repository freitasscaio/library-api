package com.caiofreitas.library.repositories;

import com.caiofreitas.library.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
