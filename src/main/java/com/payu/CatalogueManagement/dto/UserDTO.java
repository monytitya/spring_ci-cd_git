package com.payu.CatalogueManagement.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String email;
    private String address;
    private String type;
    // NOTE: password is intentionally excluded from response DTO for security
}
