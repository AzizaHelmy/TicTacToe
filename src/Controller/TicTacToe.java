/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
        pop.close(stage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

}
