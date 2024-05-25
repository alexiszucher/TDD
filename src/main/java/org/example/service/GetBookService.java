package org.example.service;

import org.example.model.Book;
import org.example.repository.BookRepository;

import java.util.Optional;

public class GetBookService {

    private BookRepository bookRepository;

    public GetBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> get(Long id) {
        return bookRepository.findById(id);
    }

}
