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
import loginpackage.ViewSCreen;
import static loginpackage.ViewSCreen.friiends;
import static loginpackage.ViewSCreen.gameScreen;
import static loginpackage.ViewSCreen.levelScreen;
import static loginpackage.ViewSCreen.login;
import static loginpackage.ViewSCreen.onlineScreen;
import static loginpackage.ViewSCreen.register;
import static loginpackage.ViewSCreen.serverscreen;
import static loginpackage.ViewSCreen.welcomescreen;

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
       ViewSCreen.view(login);
       Scene scene = new Scene(root,700,500);
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
