/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static tictactoe.ViewSCreen.friiends;
import static tictactoe.ViewSCreen.gameScreen;
import static tictactoe.ViewSCreen.levelScreen;
import static tictactoe.ViewSCreen.login;
import static tictactoe.ViewSCreen.onlineScreen;
import static tictactoe.ViewSCreen.register;
import static tictactoe.ViewSCreen.serverscreen;
import static tictactoe.ViewSCreen.welcomescreen;

/**
 *
 * @author Azza Helmy
 */
public class TicTacToe extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        StackPane root = new StackPane();

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
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

}
