package org.example.infrastructure.repository;

import org.example.UseCaseResponse;
import org.example.domain.model.Book;
import org.example.domain.repository.BookRepository;

import java.util.*;

public class BookRepositoryImpl implements BookRepository {

    private Long id = 0L;
    private Map<Long, Book> books = new HashMap<>();

    @Override
    public UseCaseResponse<Long> add(Book book) {
        id++;
        book.setId(id);
        books.put(book.getId(), book);
        return UseCaseResponse.createSuccessResponse(book.getId());
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.ofNullable(books.get(id));
    }

    @Override
    public UseCaseResponse<Book> update(Book book) {
        books.replace(book.getId(), book);
        return UseCaseResponse.createSuccessResponse(book);
    }

}
