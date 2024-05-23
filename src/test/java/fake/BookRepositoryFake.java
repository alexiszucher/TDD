package fake;

import org.example.model.Book;
import org.example.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryFake implements BookRepository {

    private List<Book> books = new ArrayList<>();

    @Override
    public boolean add(Book book) {
        return books.add(book);
    }
}
