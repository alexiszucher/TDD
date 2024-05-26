package application;

import fake.BookRepositoryFake;
import org.example.domain.model.Book;
import org.example.domain.repository.BookRepository;
import org.example.application.GetBookUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class GetBookUseCaseTest {

    private BookRepository bookRepository = new BookRepositoryFake();
    private GetBookUseCase getBookUseCase = new GetBookUseCase(bookRepository);
    private Book BOOK = new Book(1L, "Livre", "Auteur");

    @Test
    public void givenGoodDataThenBookIsUpdated() {
        givenBook(BOOK);
        Optional<Book> bookFound = getBookUseCase.get(BOOK.getId());
        Assertions.assertTrue(bookFound.isPresent());
        Assertions.assertEquals(bookFound.get().getId(), BOOK.getId());
        Assertions.assertEquals(bookFound.get().getName(), BOOK.getName());
        Assertions.assertEquals(bookFound.get().getAuthor(), BOOK.getAuthor());
    }

    private void givenBook(Book book) {
        bookRepository.add(book);
    }

}
