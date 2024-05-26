package application;

import fake.BookRepositoryFake;
import org.example.UseCaseResponse;
import org.example.domain.model.Book;
import org.example.domain.repository.BookRepository;
import org.example.application.UpdateBookUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class UpdateBookUseCaseTest {

    private BookRepository bookRepository = new BookRepositoryFake();
    private UpdateBookUseCase updateBookUseCase = new UpdateBookUseCase(bookRepository);

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
        UseCaseResponse<Book> responseUpdate = updateBookUseCase.update(BOOK);
        Assertions.assertTrue(responseUpdate.isSuccess());
        Assertions.assertEquals(responseUpdate.getBody().getAuthor(), UPDATE_AUTHOR);
        Assertions.assertEquals(responseUpdate.getBody().getName(), UPDATE_NAME);
    }
}
