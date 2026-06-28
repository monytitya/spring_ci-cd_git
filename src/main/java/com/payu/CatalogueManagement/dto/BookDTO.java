package com.payu.CatalogueManagement.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {
    private Long id;
    private String title;
    private String edition;
    private String author;
    private String publisher;
    private Integer copies;
    private String source;
    private Double cost;
    private String remarks;
}
