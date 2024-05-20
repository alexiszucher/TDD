package model;

import org.example.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    private static String NAME = "Livre";
    private static String AUTHOR = "Auteur";

    @Test
    public void givenGoodDataThenBookObjectIsCreated() {
        Book book = new Book(NAME, AUTHOR);
        Assertions.assertEquals(book.getName(), NAME);
        Assertions.assertEquals(book.getAuthor(), AUTHOR);
    }

}
