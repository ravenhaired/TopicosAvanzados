package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private HBox hBox;
    private VBox vBox;
    private Button boton1,boton2,boton3;




    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


        CrearUI();

        primaryStage.setTitle("Proyecto de Clase");
        primaryStage.setScene(new Scene(vBox, 300, 275));
        primaryStage.show();
    }

        private void CrearUI(){
            boton1=new Button("Botón 1");
            boton2=new Button("Botón 2");
            boton3=new Button("Botón 3");

            hBox=new HBox();
            vBox=new VBox();




            hBox.getChildren().addAll(boton1,boton2,boton3);
            hBox.setSpacing(10);
            hBox.setPadding(new Insets(20,20,20,20));

            vBox.getChildren().addAll(boton1,boton2,boton3);
            vBox.setSpacing(10);
            vBox.setPadding(new Insets(20));



        }


    public static void main(String[] args) {
        launch(args);
    }
}
