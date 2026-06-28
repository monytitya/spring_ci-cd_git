package com.payu.CatalogueManagement.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookReturnRecordDTO {
    private Long id;

    // IDs used for request (linking entities)
    private Long bookId;
    private Long studentId;
    private Long staffId;

    // Denormalized fields returned in response
    private String bookTitle;
    private String studentFirstName;
    private String staffFirstName;

    private Integer studentNoCopies;
    private LocalDate releaseDate;
    private LocalDate dueDate;
    private LocalDate dateReturned;
}
