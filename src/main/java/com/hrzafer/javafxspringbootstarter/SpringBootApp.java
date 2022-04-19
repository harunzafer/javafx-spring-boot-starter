package com.hrzafer.javafxspringbootstarter;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {
    public static void main(String[] args) {
        Application.launch(JavaFxApp.class, args);
    }
}
