/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.WithFriendBase;
import Controller.WelcomeBase;
import Controller.ComputerEasyLevel;
import Controller.GamePlayScreenBase;
import Controller.GameHelper;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Controller.LevelScreenBase;
import Controller.loginscreenBase;
import Controller.registerscreenBase;
import Controller.onlinePlayersScreenBase;

/**
 *
 * @author Ali
 */
public class Navigation {

    public loginscreenBase loginScreen = new loginscreenBase();
    public registerscreenBase registerScreen = new registerscreenBase();
    public WelcomeBase welcomeScreen = new WelcomeBase();
    public WithFriendBase withFriendScreen = new WithFriendBase();
    public onlinePlayersScreenBase onlineScreen = new onlinePlayersScreenBase();
    public LevelScreenBase levelScreen = new LevelScreenBase();
    public GamePlayScreenBase easyGame;
     
    public void navigateToWelcome(ActionEvent event) {
        Parent root = welcomeScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateToLoginScreen(ActionEvent event) {
        Parent root = loginScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateToRegisterScreen(ActionEvent event) {
        Parent root = registerScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateTowithFriendsScreen(ActionEvent event) {
        Parent root = withFriendScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateToGameScreen(ActionEvent event,GameHelper g) {
        easyGame = new GamePlayScreenBase(g);
        Parent root = easyGame;
        System.out.println(easyGame.toString());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateToOnlineScreen(ActionEvent event) {
        Parent root = onlineScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateToLevelScreen(ActionEvent event) {
        Parent root = levelScreen;
        System.out.println(levelScreen.toString());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

}
