package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@DiscriminatorValue("fte")
public class FullTimeEmployee extends Employee {

    @Column(name = "salary")
    private double salary;

}
