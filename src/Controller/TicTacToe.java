/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Azza Helmy
 */

public class TicTacToe extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = new WelcomeBase();
        Navigation nav = new Navigation();
        nav.setStage(stage);
        Scene scene = new Scene(root, 600, 630);
        stage.setScene(scene);
        stage.setMinHeight(402);
        stage.setMinWidth(600);
        stage.show();
        PopUp pop = new PopUp();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                pop.closeTheGame();
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

}
