package com.hrzafer.javafxspringbootstarter.controller;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

@Component
@FxmlView("about.fxml")
public class AboutController {

    private Stage stage;

    @FXML
    private AnchorPane pane;

    @FXML
    public void initialize() {
        this.stage = new Stage();
        stage.setScene(new Scene(pane));
    }

    public void show() {
        stage.show();
    }
}
