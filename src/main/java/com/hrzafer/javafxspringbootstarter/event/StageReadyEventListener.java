package com.hrzafer.javafxspringbootstarter.event;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StageReadyEventListener implements ApplicationListener<StageReadyEvent> {

    private final ApplicationContext applicationContext;
    private final String applicationTitle;

    public StageReadyEventListener(ApplicationContext applicationContext,
                                   @Value("${app.title}") String applicationTitle) {
        this.applicationTitle = applicationTitle;
        this.applicationContext = applicationContext;
    }


    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.getStage();
        Pane helloPane = new Pane(new Label("Hello JavaFx"));
        stage.setScene(new Scene(helloPane, 300, 100));
        stage.setTitle(this.applicationTitle);
        stage.show();
    }
}
