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
    protected static Stage stage;
    protected Scene scene;

    public void setStage(Stage stage) {
        Navigation.stage = stage;
    }

    public void navigateToWelcome() {

        welcomeScreen = new WelcomeBase();
        root = welcomeScreen;
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateToLoginScreen() {
        loginScreen = new loginscreenBase();
        root = loginScreen;
        scene = new Scene(root, 600, 630);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateToRegisterScreen() {
        registerScreen = new registerscreenBase();
        root = registerScreen;
        scene = new Scene(root, 600, 630);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateTowithFriendsScreen() {
        withFriendScreen = new WithFriendBase();
        root = withFriendScreen;
        scene = new Scene(root, 600, 630);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateToGameScreen(GameHelper g) {
        gameScreen = new GamePlayScreenBase(g);
        root = gameScreen;
        scene = new Scene(root, 600, 630);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateToOnlineScreen(Player player) {
        onlineScreen = new onlinePlayersScreenBase(player);
        root = onlineScreen;
        scene = new Scene(root, 600, 630);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateToLevelScreen() {
        levelScreen = new LevelScreenBase();
        root = levelScreen;
        scene = new Scene(root, 600, 630);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateToRegistrationScreen() {
        serverRegistrationScreen = new ServerRegistrationBase();
        root = serverRegistrationScreen;
        scene = new Scene(root, 600, 630);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

}