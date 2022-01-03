/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Player;

/**
 *
 * @author Ali
 */
public class Navigation {

    protected loginscreenBase loginScreen;
    protected registerscreenBase registerScreen;
    protected WelcomeBase welcomeScreen;
    protected WithFriendBase withFriendScreen;
    protected onlinePlayersScreenBase onlineScreen;
    protected LevelScreenBase levelScreen;
    protected ServerRegistrationBase serverRegistrationScreen;
    protected GamePlayScreenBase gameScreen;
    protected Parent root;
    protected Stage stage;
    protected Scene scene;

    public void navigateToWelcome(ActionEvent event) {
        welcomeScreen = new WelcomeBase();
        root = welcomeScreen;
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateToLoginScreen(ActionEvent event) {
        loginScreen = new loginscreenBase();
        root = loginScreen;
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateToRegisterScreen(ActionEvent event) {
        registerScreen = new registerscreenBase();
        root = registerScreen;
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateTowithFriendsScreen(ActionEvent event) {
        withFriendScreen = new WithFriendBase();
        root = withFriendScreen;
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateToGameScreen(ActionEvent event, GameHelper g) {
        gameScreen = new GamePlayScreenBase(g);
        root = gameScreen;
        System.out.println(gameScreen.toString());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateToOnlineScreen(ActionEvent event,Player player) {
        onlineScreen = new onlinePlayersScreenBase(player);
        root = onlineScreen;
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateToLevelScreen(ActionEvent event) {
        levelScreen = new LevelScreenBase();
        root = levelScreen;
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

    public void navigateToRegistrationScreen(ActionEvent event) {
        serverRegistrationScreen = new ServerRegistrationBase();
        root = serverRegistrationScreen;
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(630);
        stage.setMinWidth(600);
    }

}
