package com.hrzafer.javafxspringbootstarter.event;

import javafx.stage.Stage;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class StageReadyEvent extends ApplicationEvent {
    @Getter
    private final Stage stage;

    public StageReadyEvent(Stage stage) {
        super(stage);
        this.stage = stage;
    }
}
