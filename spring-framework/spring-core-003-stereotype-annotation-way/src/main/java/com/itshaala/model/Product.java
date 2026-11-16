package com.itshaala.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Component("product")
@Scope("singleton")
@PropertySource("classpath*:application.properties")
public class Product {

    @Value("${product.id}")
    private int id;

    @Value("${product.name}")
    private String name;

    @Value("${product.price}")
    private double price;

}
