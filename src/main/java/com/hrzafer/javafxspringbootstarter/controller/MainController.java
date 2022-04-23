package com.hrzafer.javafxspringbootstarter.controller;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxWeaver;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

@Component
@FxmlView("main.fxml")
@RequiredArgsConstructor
public class MainController {

    private final HostServices hostServices;
    private final FxWeaver fxWeaver;

    @FXML
    public TextField keywordTextField;

    @FXML
    public Button searchButton;

    @FXML
    public void initialize() {
        this.searchButton.setOnAction(actionEvent -> this.hostServices.showDocument("https://www.google.ca/search?q=" + this.keywordTextField.getText().trim()));
    }

    @FXML
    private void aboutMenuItemClicked() {
        fxWeaver.loadController(AboutController.class).show();
    }
}
