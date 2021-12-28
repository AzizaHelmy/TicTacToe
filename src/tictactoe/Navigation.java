/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import PlayWithFriend.WithFriendBase;
import Welcome.WelcomeBase;
import gameplayscreen.GamePlayScreenBase;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import levelscreen.LevelScreenBase;
import loginpackage.loginscreenBase;
import registerpackage.registerscreenBase;
import ui_online_friends_pck.onlinePlayersScreenBase;

/**
 *
 * @author Ali
 */
public class Navigation {

    public loginscreenBase loginScreen = new loginscreenBase();
    public registerscreenBase registerScreen = new registerscreenBase();
    public WelcomeBase welcomeScreen = new WelcomeBase();
    public WithFriendBase withFriendScreen = new WithFriendBase();
    public GamePlayScreenBase gameScreen = new GamePlayScreenBase();
    public onlinePlayersScreenBase onlineScreen = new onlinePlayersScreenBase();
    public LevelScreenBase levelScreen = new LevelScreenBase();

    public void navigateToWelcome(ActionEvent event) {
        Parent root = welcomeScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    public void navigateToLoginScreen(ActionEvent event) {
        Parent root = loginScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    public void navigateToRegisterScreen(ActionEvent event) {
        Parent root = registerScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    public void navigateTowithFriendsScreen(ActionEvent event) {
        Parent root = withFriendScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    public void navigateToGameScreen(ActionEvent event) {
        Parent root = gameScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    public void navigateToOnlineScreen(ActionEvent event) {
        Parent root = onlineScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    public void navigateToLevelScreen(ActionEvent event) {
        Parent root = levelScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

}
