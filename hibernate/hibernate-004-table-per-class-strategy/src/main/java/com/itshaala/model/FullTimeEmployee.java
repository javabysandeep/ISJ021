package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "full_time_employee")
public class FullTimeEmployee extends Employee {

    @Column(name = "salary")
    private double salary;

}
