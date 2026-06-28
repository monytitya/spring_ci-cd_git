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
@Table(name = "book_return_records")
public class BookReturnRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "bkdatereturn")
    private LocalDate dateReturned;

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
