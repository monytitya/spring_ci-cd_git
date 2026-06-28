package com.payu.CatalogueManagement.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String course;
    private String year;
    private String contact;
    private Integer age;
    private LocalDate birthDate;
    private String gender;
}
