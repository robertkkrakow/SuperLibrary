package com.rk.repository;

import com.rk.model.Book;

public interface IBookRepository {
    void save(Book book);
    void remove(Book book);
    void saveAll(Book book);

    public Book findById(Long id);
}
