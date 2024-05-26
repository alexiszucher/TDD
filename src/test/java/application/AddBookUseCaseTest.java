package application;

import org.example.UseCaseResponse;
import org.example.domain.model.Book;
import org.example.application.AddBookUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import fake.BookRepositoryFake;

public class AddBookUseCaseTest {

    private AddBookUseCase addBookUseCase = new AddBookUseCase(new BookRepositoryFake());

    private static Book BOOK = new Book("Livre", "Auteur");

    @Test
    public void givenGoodDataThenBookIsAdded() {
        UseCaseResponse<Long> response = addBookUseCase.add(BOOK);
        Assertions.assertTrue(response.isSuccess());
    }

}
