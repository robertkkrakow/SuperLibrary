package com.rk.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "borrow")
public class Borrow implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_borrow")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
