package org.example.service;

import org.example.UseCaseResponse;
import org.example.model.Book;
import org.example.repository.BookRepository;

public class AddBookService {

    private BookRepository bookRepository;

    public AddBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public UseCaseResponse<Long> add(Book book) {
        return bookRepository.add(book);
    }
}
