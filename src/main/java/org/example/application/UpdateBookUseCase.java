package org.example.application;

import org.example.UseCaseResponse;
import org.example.domain.model.Book;
import org.example.domain.repository.BookRepository;

public class UpdateBookUseCase {

    private BookRepository bookRepository;

    public UpdateBookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public UseCaseResponse<Book> update(Book book) {
        return bookRepository.update(book);
    }

}
