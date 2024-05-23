package service;

import org.example.model.Book;
import org.example.service.AddBookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import fake.BookRepositoryFake;

public class AddBookServiceTest {

    private AddBookService addBookService = new AddBookService(new BookRepositoryFake());

    private static Book BOOK = new Book("Livre", "Auteur");

    @Test
    public void givenGoodDataThenBookIsAdded() {
        boolean response = addBookService.add(BOOK);
        Assertions.assertTrue(response);
    }

}
