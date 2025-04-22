package com.alpharesource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EducationApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(EducationApplication.class, args);
        } catch (Exception e) {
            String s = "";
        }
    }
}
