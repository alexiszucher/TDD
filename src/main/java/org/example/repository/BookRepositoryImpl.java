package org.example.repository;

import org.example.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    private List<Book> books = new ArrayList<>();

    @Override
    public boolean add(Book book) {
        return books.add(book);
    }

}
