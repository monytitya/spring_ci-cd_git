package com.payu.CatalogueManagement.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private Long id;

    @Column(name = "stffname")
    private String firstName;

    @Column(name = "stfiname")
    private String lastName;

    @Column(name = "stfcontactnumber")
    private String contactNumber;

    @Column(name = "stfemail")
    private String email;

    @Column(name = "stfaddress")
    private String address;

    @Column(name = "stfpassword")
    private String password;

    @Column(name = "stftype")
    private String type;
}
