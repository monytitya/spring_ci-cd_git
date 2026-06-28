package com.payu.CatalogueManagement.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(name = "bktitle")
    private String title;

    @Column(name = "bkedition")
    private String edition;

    @Column(name = "bkauthor")
    private String author;

    @Column(name = "bkpublisher")
    private String publisher;

    @Column(name = "bkcopies")
    private Integer copies;

    @Column(name = "bksource")
    private String source;

    @Column(name = "bkcost")
    private Double cost;

    @Column(name = "bkremarks")
    private String remarks;
}
