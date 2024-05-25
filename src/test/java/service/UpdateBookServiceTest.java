package service;

import fake.BookRepositoryFake;
import org.example.UseCaseResponse;
import org.example.model.Book;
import org.example.repository.BookRepository;
import org.example.service.UpdateBookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class UpdateBookServiceTest {

    private BookRepository bookRepository = new BookRepositoryFake();
    private UpdateBookService updateBookService = new UpdateBookService(bookRepository);

    private Book BOOK = new Book("Livre", "Auteur");
    private static String UPDATE_AUTHOR = "Auteur2";
    private static String UPDATE_NAME = "Livre2";

    @Test
    public void givenGoodDataThenBookIsUpdated() {
        UseCaseResponse<Long> response = bookRepository.add(BOOK);
        Optional<Book> bookToUpdateOpt = bookRepository.findById(response.getBody());
        Assertions.assertTrue(bookToUpdateOpt.isPresent());
        Book bookToUpdate = bookToUpdateOpt.get();
        bookToUpdate.setAuthor(UPDATE_AUTHOR);
        bookToUpdate.setName(UPDATE_NAME);
        UseCaseResponse<Book> responseUpdate = updateBookService.update(BOOK);
        Assertions.assertTrue(responseUpdate.isSuccess());
        Assertions.assertEquals(responseUpdate.getBody().getAuthor(), UPDATE_AUTHOR);
        Assertions.assertEquals(responseUpdate.getBody().getName(), UPDATE_NAME);
    }
}
