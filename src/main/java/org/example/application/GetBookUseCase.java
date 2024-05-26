package org.example.application;

import org.example.domain.model.Book;
import org.example.domain.repository.BookRepository;

import java.util.Optional;

public class GetBookUseCase {

    private BookRepository bookRepository;

    public GetBookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> get(Long id) {
        return bookRepository.findById(id);
    }

}
