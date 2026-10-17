package com.itshaala.model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Income {
    private int id;
    private double amount;
    private String description;
    private Category category;
    private LocalDate date;
}
