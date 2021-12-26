/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import PlayWithFriend.WithFriendBase;
import Welcome.WelcomeBase;
import gameplayscreen.GamePlayScreenBase;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import levelscreen.LevelScreenBase;
import loginpackage.loginscreenBase;
import registerpackage.registerscreenBase;
import serverscreen.ServerScreenBase;
import ui_online_friends_pck.onlinePlayersScreenBase;

/**
 *
 * @author Salma
 */
public class ViewSCreen {
    
public static loginscreenBase login =new loginscreenBase ();
public static registerscreenBase register= new registerscreenBase ();
public static WelcomeBase welcomescreen =new WelcomeBase();
public static WithFriendBase friiends=new WithFriendBase();
  public static GamePlayScreenBase gameScreen=new GamePlayScreenBase();
  public static  onlinePlayersScreenBase onlineScreen = new onlinePlayersScreenBase();
  public static LevelScreenBase levelScreen =new LevelScreenBase() ;
  public static ServerScreenBase serverscreen =new ServerScreenBase();
  
   public static void view(Pane pane){
   login.setVisible(false);
   register.setVisible(false);
  welcomescreen.setVisible(false);
   friiends.setVisible(false);
   onlineScreen.setVisible(false);
  levelScreen.setVisible(false);
   welcomescreen.setVisible(false);
   serverscreen.setVisible(false);
   gameScreen.setVisible(false);
   
   pane.setVisible(true);
   
   }
    
}
