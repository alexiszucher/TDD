package repository;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.example.repository.BookRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookRepositoryImplTest {
    private BookRepository bookRepository = new BookRepositoryImpl();
    private Book BOOK = new Book("Livre", "Auteur");

    @Test
    public void shouldAddBookWhenAllDataIsCorrect() {
        Assertions.assertTrue(bookRepository.add(BOOK));
    }
}
