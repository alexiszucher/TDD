package repository;

import org.example.UseCaseResponse;
import org.example.model.Book;
import org.example.repository.BookRepository;
import org.example.infrastructure.repository.BookRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class BookRepositoryImplTest {
    private BookRepository bookRepository = new BookRepositoryImpl();
    private Book BOOK = new Book("Livre", "Auteur");

    private String UPDATE_AUTHOR = "AUTEUR 2";
    private String UPDATE_NAME = "NOM 2";

    @Test
    public void shouldAddBookWhenAllDataIsCorrect() {
        UseCaseResponse<Long> response = bookRepository.add(BOOK);
        Assertions.assertTrue(response.isSuccess());
    }

    @Test
    public void shouldFindBookWhenIdIsCorrect() {
        bookRepository.add(BOOK);
        Optional<Book> bookFound = bookRepository.findById(BOOK.getId());
        Assertions.assertTrue(bookFound.isPresent());
        Assertions.assertEquals(bookFound.get().getId(), BOOK.getId());
        Assertions.assertEquals(bookFound.get().getName(), BOOK.getName());
        Assertions.assertEquals(bookFound.get().getAuthor(), BOOK.getAuthor());
    }

    @Test
    public void shoulUpdateBookWhenIdIsCorrect() {
        bookRepository.add(BOOK);
        Optional<Book> bookFoundOpt = bookRepository.findById(BOOK.getId());
        Assertions.assertTrue(bookFoundOpt.isPresent());
        Book bookToUpdate = bookFoundOpt.get();
        bookToUpdate.setName(UPDATE_NAME);
        bookToUpdate.setAuthor(UPDATE_AUTHOR);

        UseCaseResponse<Book> response = bookRepository.update(bookToUpdate);

        Assertions.assertEquals(response.getBody().getId(), bookToUpdate.getId());
        Assertions.assertEquals(response.getBody().getName(), bookToUpdate.getName());
        Assertions.assertEquals(response.getBody().getAuthor(), bookToUpdate.getAuthor());
    }
}
