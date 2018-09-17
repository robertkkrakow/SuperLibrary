package com.rk.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "book")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_book")
    private Long id;

    @Column(name = "borrow")
    private boolean borrow;

    @Column(name = "category")
    private String category;

    @Column(name = "isbn", nullable = false, length = 13)
    private String isbn;

    @Column(name = "pages")
    private int pages;

    @Temporal(TemporalType.DATE)
    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "summary", length = 350)
    private String summary;

    @Column(name = "title", nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
