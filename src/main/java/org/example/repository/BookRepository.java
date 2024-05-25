package org.example.repository;

import org.example.UseCaseResponse;
import org.example.model.Book;

import java.util.Optional;

public interface BookRepository {

    UseCaseResponse<Long> add(Book book);

    Optional<Book> findById(Long id);

    UseCaseResponse<Book> update(Book book);

}
