package org.example.application;

import org.example.UseCaseResponse;
import org.example.domain.model.Book;
import org.example.domain.repository.BookRepository;

public class AddBookUseCase {

    private BookRepository bookRepository;

    public AddBookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public UseCaseResponse<Long> add(Book book) {
        return bookRepository.add(book);
    }
}
