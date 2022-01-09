/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Player;

/**
 *
 * @author Ali
 */
public class Navigation {

    protected Parent root;
    protected static Stage stage;
    protected Scene scene;

    public void setStage(Stage stage) {
        Navigation.stage = stage;
    }

    public void navigateToWelcome() {
        root = new WelcomeBase();
        scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }
    //====================================================
    public void navigateToDisplayRecord() {
        root = new DisplayRecordBase();
        scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }
    
    //=================================================== 

    public void navigateToRecordescreen() {
        root = new Recordedfiles_screenBase();
        scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);

    }

    public void navigateToLoginScreen() {
        root = new loginscreenBase();
        scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateToRegisterScreen() {
        root = new registerscreenBase();
        scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateTowithFriendsScreen() {
        root = new WithFriendBase();
        scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateToGameScreen(GameHelper g) {
        root = new GamePlayScreenBase(g);
        scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateToOnlineScreen(Player player) {
        root = new onlinePlayersScreenBase(player);
        scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

    public void navigateToLevelScreen() {
        root = new LevelScreenBase();
        scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }
//==========================================================
    
    public void navigateToRegistrationScreen() {
        root = new ServerRegistrationBase();
        scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);
    }

}
