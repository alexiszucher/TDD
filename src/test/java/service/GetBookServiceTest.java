package service;

import fake.BookRepositoryFake;
import org.example.model.Book;
import org.example.repository.BookRepository;
import org.example.service.GetBookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class GetBookServiceTest {

    private BookRepository bookRepository = new BookRepositoryFake();
    private GetBookService getBookService = new GetBookService(bookRepository);

    private Book BOOK = new Book(1L, "Livre", "Auteur");
    private static String UPDATE_AUTHOR = "Auteur2";
    private static String UPDATE_NAME = "Livre2";

    @Test
    public void givenGoodDataThenBookIsUpdated() {
        givenBook(BOOK);
        Optional<Book> bookFound = getBookService.get(BOOK.getId());
        Assertions.assertTrue(bookFound.isPresent());
        Assertions.assertEquals(bookFound.get().getId(), BOOK.getId());
        Assertions.assertEquals(bookFound.get().getName(), BOOK.getName());
        Assertions.assertEquals(bookFound.get().getAuthor(), BOOK.getAuthor());
    }

    private void givenBook(Book book) {
        bookRepository.add(book);
    }

}
