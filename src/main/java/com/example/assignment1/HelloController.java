package com.example.assignment1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.nio.channels.Pipe;

public class HelloController {

    public Pane pane1, pane2, pane3;
    public Pane pane4;
    public Label label;
    public ImageView image;
    public Label label1;

    @FXML
    void Austria() {
        pane1.setStyle("-fx-background-color: red");
        pane2.setStyle("-fx-background-color:white");
        pane3.setStyle("-fx-background-color: red");
        label.setText("Europe");
        label1.setText("Austria");

    }

    @FXML
    void Gabon() {
        pane1.setStyle("-fx-background-color: green");
        pane2.setStyle("-fx-background-color: yellow");
        pane3.setStyle("-fx-background-color: blue");
        label.setText("Africa");
        label1.setText("Gabon");

    }

    @FXML
    void Germany() {
        pane1.setStyle("-fx-background-color: black");
        pane2.setStyle("-fx-background-color: red");
        pane3.setStyle("-fx-background-color: orange");
        label.setText("Europe");
        label1.setText("Germany");


    }

    @FXML
    void NetherLand() {
        pane1.setStyle("-fx-background-color: red");
        pane2.setStyle("-fx-background-color:white");
        pane3.setStyle("-fx-background-color: blue");
        label.setText("Europe");
        label1.setText("NetherLand");

    }

    @FXML
    void Russia() {
        pane1.setStyle("-fx-background-color: white");
        pane2.setStyle("-fx-background-color:blue");
        pane3.setStyle("-fx-background-color: red");
        label.setText("Asia");
        label1.setText("Russia");


    }

    @FXML
    void Clear() {
        pane1.setStyle("-fx-background-color: transparent");
        pane2.setStyle("-fx-background-color: transparent");
        pane3.setStyle("-fx-background-color: transparent");
        label.setText("Label");
        label1.setText("Label");

    }



}
