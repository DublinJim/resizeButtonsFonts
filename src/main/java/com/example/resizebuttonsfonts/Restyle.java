package com.example.resizebuttonsfonts;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Restyle implements Initializable {
    public FlowPane rootFlowPane;
    public ArrayList<Button> btnList = new ArrayList();
    public int btnNumber;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnNumber = 10;
        Button[] btn = new Button[btnNumber];
        for (int i = 0; i < 10; i++) {

            btn[i] = new Button();
            btn[i].setText("Radio " + i);

            rootFlowPane.getChildren().add(btn[i]);

        }
        btn[0].setText("Reset Font");
        btn[0].setOnAction(E -> btn[4].setText("Ouch !!"));
        System.out.println(btnList);

        Slider sliAmount = new Slider();
        sliAmount.setMin(1);
        sliAmount.setMax(10);
        sliAmount.setValue(5);
        sliAmount.setMaxWidth(100);
        VBox sliderbox = new VBox(sliAmount);
        rootFlowPane.getChildren().add(sliderbox);
    }
}
