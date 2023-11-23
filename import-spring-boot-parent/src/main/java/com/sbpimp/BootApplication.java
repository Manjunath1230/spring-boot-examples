package com.sbpimp;

import com.sbpimp.beans.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootApplication.class, args);
        Book book = context.getBean(Book.class);
        System.out.println(book);
    }
}
