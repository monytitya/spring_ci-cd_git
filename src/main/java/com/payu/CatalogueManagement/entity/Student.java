package com.payu.CatalogueManagement.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stud_id")
    private Long id;

    @Column(name = "stfname")
    private String firstName;

    @Column(name = "stiname")
    private String lastName;

    @Column(name = "stcourse")
    private String course;

    @Column(name = "styear")
    private String year;

    @Column(name = "stcontact")
    private String contact;

    @Column(name = "stage")
    private Integer age;

    @Column(name = "stbirthdate")
    private LocalDate birthDate;

    @Column(name = "stgender")
    private String gender;
}
