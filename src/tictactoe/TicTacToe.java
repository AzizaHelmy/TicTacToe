/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import Welcome.WelcomeBase;
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
        // Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        /* StackPane root = new StackPane();

        root.getChildren().add(login);
        root.getChildren().add(register);
        root.getChildren().add(welcomescreen);
        root.getChildren().add(friiends);
        root.getChildren().add(gameScreen);
        root.getChildren().add(serverscreen);
        root.getChildren().add(onlineScreen);
        root.getChildren().add(levelScreen);
        
        ViewSCreen.view(welcomescreen);
        
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();*/
        Parent root = new WelcomeBase();

        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
//        stage.setResizable(false);
        stage.setMinHeight(630);
        stage.setMinWidth(600);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

}
