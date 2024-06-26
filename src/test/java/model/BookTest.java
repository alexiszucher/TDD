package model;

import org.example.domain.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    private static Long ID = 1L;
    private static String NAME = "Livre";
    private static String AUTHOR = "Auteur";

    @Test
    public void givenGoodDataThenBookObjectIsCreated() {
        Book book = new Book(ID, NAME, AUTHOR);
        Assertions.assertEquals(book.getId(), ID);
        Assertions.assertEquals(book.getName(), NAME);
        Assertions.assertEquals(book.getAuthor(), AUTHOR);
    }

}
