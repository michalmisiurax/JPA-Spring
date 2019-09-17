package pl.michalm.dao;

import pl.michalm.model.Book;

public interface BookDao {
    public void save(Book book);
    public Book get(Long id);
}