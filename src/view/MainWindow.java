package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindow extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Willkommen bei JMemView");

        VBox layout = new VBox();
        layout.getChildren().add(label);

        Scene scene = new Scene(layout, 500, 300);

        stage.setTitle("JMemView");
        stage.setScene(scene);
        stage.show();
    }
}
