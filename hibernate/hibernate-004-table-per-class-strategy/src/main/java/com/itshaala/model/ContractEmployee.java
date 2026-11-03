package com.itshaala.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "contract_employee")
public class ContractEmployee extends Employee {

    @Column(name = "invoiceAmount")
    private double invoiceAmount;

}
