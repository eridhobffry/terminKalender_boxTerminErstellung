package com.company;

import com.AlertBox;
import com.TextBox;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{



    Stage firstStage;
    Button buttonNeuTermin;


    public static void main(String[] args) {
	    launch(args); //Show up programm java fx
    }

    @Override
    public void start(Stage primaryStage) throws Exception{ //Stage -- Minimize, close
        firstStage = primaryStage;
        firstStage.setTitle("Neuer Termin");

        firstStage.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });


        Label label1 = new Label();
        label1.setText("Hier drücken um Termin zu Erzeugen");
        buttonNeuTermin = new Button("Neuer Termin");

        buttonNeuTermin.setOnAction(e -> TextBox.display());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label1, buttonNeuTermin);
        Scene scene = new Scene(layout, 300, 200);
        firstStage.setScene(scene);
        firstStage.show();

    }

    private void closeProgram(){
        Boolean answer = ConfirmBox.display();
        if(answer)
            firstStage.close();
    }
}
