package com.itshaala;

import com.itshaala.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //starting the spring container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.cfg.xml");


        //get the bean from spring container
        Product product = context.getBean("product", Product.class);

        System.out.println(product);
    }
}
