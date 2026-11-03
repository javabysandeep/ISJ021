package com.itshaala.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@DiscriminatorValue("c2h")
public class ContractEmployee extends Employee {

    @Column(name = "invoiceAmount")
    private double invoiceAmount;

}
