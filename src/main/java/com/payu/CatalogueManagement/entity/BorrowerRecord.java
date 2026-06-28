package com.payu.CatalogueManagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "borrower_records")
public class BorrowerRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowers_id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column(name = "bktitle")
    private String bookTitle;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stud_id", nullable = false)
    private Student student;

    @Column(name = "stfname")
    private String studentFirstName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "staff_id", nullable = false)
    private User staff;

    @Column(name = "stffname")
    private String staffFirstName;

    @Column(name = "student_no_copies")
    private Integer studentNoCopies;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @PrePersist
    @PreUpdate
    public void populateDenormalizedFields() {
        if (book != null) {
            this.bookTitle = book.getTitle();
        }
        if (student != null) {
            this.studentFirstName = student.getFirstName();
        }
        if (staff != null) {
            this.staffFirstName = staff.getFirstName();
        }
    }
}
