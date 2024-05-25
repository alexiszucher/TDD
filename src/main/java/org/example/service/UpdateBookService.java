package org.example.service;

import org.example.UseCaseResponse;
import org.example.model.Book;
import org.example.repository.BookRepository;

import java.util.Optional;

public class UpdateBookService {

    private BookRepository bookRepository;

    public UpdateBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public UseCaseResponse<Book> update(Book book) {
        return bookRepository.update(book);
    }

}
