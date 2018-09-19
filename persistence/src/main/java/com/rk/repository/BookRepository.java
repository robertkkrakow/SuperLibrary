package com.rk.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.awt.print.Book;

public class BookRepository extends GenericDao<Book, Long> implements IBookRepository{

    public BookRepository(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public void save(com.rk.model.Book book) {

    }

    @Override
    public void remove(com.rk.model.Book book) {

    }

    @Override
    public void saveAll(com.rk.model.Book book) {

    }

    @Override
    public com.rk.model.Book findById(Long id) {
        return null;
    }
}
