package org.example.model;

public class Book {

    private Long id;
    private String name;
    private String author;

    public Book(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
}
