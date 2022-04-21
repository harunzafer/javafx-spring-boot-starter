package com.hrzafer.javafxspringbootstarter.controller;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Component;

@Component
public class MainController {

    private final HostServices hostServices;

    @FXML
    public TextField keywordTextField;

    @FXML
    public Button searchButton;

    public MainController(HostServices hostServices) {
        this.hostServices = hostServices;
    }

    @FXML
    public void initialize() {
        this.searchButton.setOnAction(actionEvent -> this.hostServices.showDocument("https://www.google.ca/search?q=" + this.keywordTextField.getText().trim()));
    }
}
