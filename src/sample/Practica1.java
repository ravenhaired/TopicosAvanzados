package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.border.Border;


public class Practica1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ColorPicker color = new ColorPicker(Color.PURPLE);

        StackPane root = new StackPane();
        root.getChildren().add(color);
        root.setAlignment(Pos.TOP_LEFT);
        root.setPadding(new Insets(10.0));

// Agregar menejador de eventos para el cambio de color
        color.setOnAction(e -> {
            BackgroundFill fill = new BackgroundFill(color.getValue(), null, null);
            root.setBackground(new Background(fill));
        });

        Scene scene = new Scene(root, 300, 600);

        primaryStage.setTitle("Cambiar color");
        primaryStage.setScene(scene);
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }


}
