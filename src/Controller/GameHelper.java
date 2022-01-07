/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import model.buttonDetails;

/**
 *
 * @author Azza Helmy
 */
public class GameHelper {

    protected String start;
    protected String end;
    protected Random random;
    protected int randomNum;
    protected Image first;
    protected Image second;
    protected String x;
    protected String o;
    protected boolean changeTurn = true;
    protected String player1;

    protected String player2;
    protected int counter = 0;
    protected String isWin;
    protected Media media;
    protected MediaPlayer mediaPlayer;
    protected MediaView mediaView;
    protected File mediaFile;
    protected int score1 = 0;
    protected int score2 = 0;

    protected String Player1Score;
    protected String Player2Score;
    protected Label player1Name;
    protected Label player2Name;
    protected AnchorPane xoPane;

    protected Vector<Button> buttons = new Vector<>();
    protected Vector<ImageView> imags = new Vector<>();
    protected Vector<Label> labels = new Vector<>();
    protected PopUp pop = new PopUp();
    protected  String fileName;
    int i = 0;
//=======================================================

    public void setButtons(Vector<Button> b) {
        for (int i = 0; i < b.size(); i++) {
            buttons.add(i, b.get(i));
        }
    }

    public void setImages(Vector<ImageView> v) {
        for (int i = 0; i < v.size(); i++) {
            imags.add(i, v.get(i));
        }
    }

    public void setLabels(Vector<Label> l) {
        for (int i = 0; i < l.size(); i++) {
            labels.add(i, l.get(i));
        }
    }

    public void setPane(AnchorPane a) {
        xoPane = a;
    }
//==================================================================

    public void changeXO() {

        random = new Random();
        randomNum = random.nextInt(2) + 1;

        start = "/assets/gamePlay" + randomNum + ".png";

        if (start.equals("/assets/gamePlay1.png")) {
            end = "/assets/gamePlay2.png";
            player2 = "x";
        } else {
            end = "/assets/gamePlay1.png";
            player2 = "o";
        }

        if (player2.equals("x")) {
            player1 = "o";
        } else {
            player1 = "x";
        }
        first = new Image(getClass().getResource(start).toExternalForm());
        second = new Image(getClass().getResource(end).toExternalForm());
        imags.get(9).setImage(first);
        imags.get(10).setImage(second);
    }
//=================================================================

    public void setPlayingIcon(ImageView imageView, Button button) {
        counter++;
        imageView.setVisible(true);
        imageView.setImage(changingTurn(changeTurn, button));
        button.setDisable(true);
        
        changeTurn = !changeTurn;

    }
//===================================================================

    public Image changingTurn(boolean flag, Button button) {
        if (flag) {
            button.setText(player1);
            return first;
        } else {
            button.setText(player2);
            return second;
        }
    }
//================================================================

    public boolean isWinning(String player) {
        if ((buttons.get(0).getText().equals(player) && buttons.get(1).getText().equals(player) && buttons.get(2).getText().equals(player))
                || (buttons.get(3).getText().equals(player) && buttons.get(4).getText().equals(player) && buttons.get(5).getText().equals(player))
                || (buttons.get(6).getText().equals(player) && buttons.get(7).getText().equals(player) && buttons.get(8).getText().equals(player))
                || (buttons.get(0).getText().equals(player) && buttons.get(3).getText().equals(player) && buttons.get(6).getText().equals(player))
                || (buttons.get(1).getText().equals(player) && buttons.get(4).getText().equals(player) && buttons.get(7).getText().equals(player))
                || (buttons.get(2).getText().equals(player) && buttons.get(5).getText().equals(player) && buttons.get(8).getText().equals(player))
                || (buttons.get(0).getText().equals(player) && buttons.get(4).getText().equals(player) && buttons.get(8).getText().equals(player))
                || (buttons.get(2).getText().equals(player) && buttons.get(4).getText().equals(player) && buttons.get(6).getText().equals(player))) {
            drawLineOfColors();
            return true;
        } else {

            return false;
        }
    }
//================================================================

    public void checkWinning() {
        if (isWinning(player1)) {
            score1++;
            pop.annimation();
            setDisable();
            buttons.get(9).setVisible(true);
            labels.get(2).setText("" + score1);

            if (buttons.get(11).getText().equals("Recording")) {
                save();
                buttons.get(11).setText("Load");
                buttons.get(11).setDisable(false);
            }
        } else if (isWinning(player2)) {
            score2++;
            pop.annimation();
            setDisable();
            buttons.get(9).setVisible(true);
            labels.get(3).setText("" + score2);
            if (buttons.get(11).getText().equals("Recording")) {
                save();
                buttons.get(11).setText("Load");
                buttons.get(11).setDisable(false);
            }
        } else if (counter == 9) {//no one win ,
            // setEnable();
            setDisable();
            buttons.get(9).setVisible(true);
            if (buttons.get(11).getText().equals("Recording")) {
                save();
                buttons.get(11).setText("Load");
                buttons.get(11).setDisable(false);
                
            }

        }
    }
    //=================================================

    public void setEnable() {
        buttons.get(0).setDisable(false);
        buttons.get(1).setDisable(false);
        buttons.get(2).setDisable(false);
        buttons.get(3).setDisable(false);
        buttons.get(4).setDisable(false);
        buttons.get(5).setDisable(false);
        buttons.get(6).setDisable(false);
        buttons.get(7).setDisable(false);
        buttons.get(8).setDisable(false);
    }
//====================================================    

    public void setDisable() {
        buttons.get(0).setDisable(true);
        buttons.get(1).setDisable(true);
        buttons.get(2).setDisable(true);
        buttons.get(3).setDisable(true);
        buttons.get(4).setDisable(true);
        buttons.get(5).setDisable(true);
        buttons.get(6).setDisable(true);
        buttons.get(7).setDisable(true);
        buttons.get(8).setDisable(true);
    }
//===========================================================

    public void resetting() {

        for (int i = 0; i < imags.size() - 2; i++) {
            imags.get(i).setImage(null);
            imags.get(i).setVisible(false);
        }
        for (int i = 0; i < buttons.size() - 2; i++) {
            buttons.get(i).setText("");
            buttons.get(i).setDisable(false);
            buttons.get(i).setVisible(true);
        }
        counter = 0;
        changeTurn = true;
        removeColors();
        i = 0;
    }
//==================================================

    public void drawLineOfColors() {

        if ((buttons.get(0).getText().equals(buttons.get(1).getText()))
                && (buttons.get(0).getText().equals(buttons.get(2).getText()))) {

            buttons.get(0).setStyle("-fx-background-color:#FFFF00");
            buttons.get(1).setStyle("-fx-background-color:#FFFF00");
            buttons.get(2).setStyle("-fx-background-color:#FFFF00");

        } else if ((buttons.get(6).getText().equals(buttons.get(7).getText()))
                && (buttons.get(6).getText().equals(buttons.get(8).getText()))) {

            buttons.get(6).setStyle("-fx-background-color:#FFFF00");
            buttons.get(7).setStyle("-fx-background-color:#FFFF00");
            buttons.get(8).setStyle("-fx-background-color:#FFFF00");

        } else if (buttons.get(3).getText().equals(buttons.get(4).getText())
                && buttons.get(3).getText().equals(buttons.get(5).getText())) {

            buttons.get(3).setStyle("-fx-background-color:#FFFF00");
            buttons.get(4).setStyle("-fx-background-color:#FFFF00");
            buttons.get(5).setStyle("-fx-background-color:#FFFF00");
        } else if ((buttons.get(0).getText().equals(buttons.get(3).getText())
                && buttons.get(0).getText().equals(buttons.get(6).getText()))) {

            buttons.get(0).setStyle("-fx-background-color:#FFFF00");
            buttons.get(3).setStyle("-fx-background-color:#FFFF00");
            buttons.get(6).setStyle("-fx-background-color:#FFFF00");
        } else if ((buttons.get(1).getText().equals(buttons.get(4).getText())
                && buttons.get(1).getText().equals(buttons.get(7).getText()))) {

            buttons.get(1).setStyle("-fx-background-color:#FFFF00");
            buttons.get(4).setStyle("-fx-background-color:#FFFF00");
            buttons.get(7).setStyle("-fx-background-color:#FFFF00");
        } else if ((buttons.get(2).getText().equals(buttons.get(5).getText())
                && buttons.get(2).getText().equals(buttons.get(8).getText()))) {

            buttons.get(2).setStyle("-fx-background-color:#FFFF00");
            buttons.get(5).setStyle("-fx-background-color:#FFFF00");
            buttons.get(8).setStyle("-fx-background-color:#FFFF00");
        } else if ((buttons.get(0).getText().equals(buttons.get(4).getText())
                && buttons.get(0).getText().equals(buttons.get(8).getText()))) {

            buttons.get(0).setStyle("-fx-background-color:#FFFF00");
            buttons.get(4).setStyle("-fx-background-color:#FFFF00");
            buttons.get(8).setStyle("-fx-background-color:#FFFF00");
        } else if (buttons.get(2).getText().equals(buttons.get(4).getText())
                && buttons.get(2).getText().equals(buttons.get(6).getText())) {

            buttons.get(2).setStyle("-fx-background-color:#FFFF00");
            buttons.get(4).setStyle("-fx-background-color:#FFFF00");
            buttons.get(6).setStyle("-fx-background-color:#FFFF00");
        }
    }
    //=============================================================

    public void removeColors() {
        buttons.get(0).setStyle(null);
        buttons.get(1).setStyle(null);
        buttons.get(2).setStyle(null);
        buttons.get(3).setStyle(null);
        buttons.get(4).setStyle(null);
        buttons.get(5).setStyle(null);
        buttons.get(6).setStyle(null);
        buttons.get(7).setStyle(null);
        buttons.get(8).setStyle(null);
    }

    public void save() {
        buttons.get(0).setId("TopLeftButton");
        buttons.get(1).setId("TopCentertButton");
        buttons.get(2).setId("TopRightButton");
        buttons.get(3).setId("CenterLeftButton");
        buttons.get(4).setId("CentercenterButton");
        buttons.get(5).setId("CenterRightButton");
        buttons.get(6).setId("BottomLeftButton");
        buttons.get(7).setId("BottomCenterButton");
        buttons.get(8).setId("BottomRightButton");

        String date = Date.valueOf(LocalDate.now()).toString();
        String time = Time.valueOf(LocalTime.now()).toString().replace(":", "-");
        fileName = date + "-" + time + ".json";
        saveSteps recordedSteps = new saveSteps();
        recordedSteps.recordSteps(GamePlayScreenBase.detail, fileName);
    }

    public void displayRecorded() {

        List<buttonDetails> detailed;
        saveSteps recordedSteps = new saveSteps();
        detailed = recordedSteps.loadScreen(fileName);
        System.out.println(fileName);

        Platform.runLater(() -> {
//            System.out.println(detailed.get(i).getContent());
//            System.out.println(detailed.get(i).getId());
            if (i < detailed.size()) {
                if (detailed.get(i).getId().equals("TopLeftButton")) {
                    buttons.get(0).setText(detailed.get(i).getContent());
                    
                    System.out.println("1");

                    //setPlayingIcon(topLeftIcon, topLeft);
                } else if (detailed.get(i).getId().equals("TopCentertButton")) {
                    buttons.get(1).setText(detailed.get(i).getContent());
                    System.out.println("2");

                } else if (detailed.get(i).getId().equals("TopRightButton")) {
                    buttons.get(2).setText(detailed.get(i).getContent());
                    System.out.println("3");
                } else if (detailed.get(i).getId().equals("CenterLeftButton")) {
                    buttons.get(3).setText(detailed.get(i).getContent());

                } else if (detailed.get(i).getId().equals("CentercenterButton")) {
                    buttons.get(4).setText(detailed.get(i).getContent());
                    System.out.println("5");

                } else if (detailed.get(i).getId().equals("CenterRightButton")) {
                    buttons.get(5).setText(detailed.get(i).getContent());
                    System.out.println("6");
                } else if (detailed.get(i).getId().equals("BottomLeftButton")) {
                    buttons.get(6).setText(detailed.get(i).getContent());
                    System.out.println("7");
                } else if (detailed.get(i).getId().equals("BottomCenterButton")) {
                    buttons.get(7).setText(detailed.get(i).getContent());
                    System.out.println("8");
                } else if (detailed.get(i).getId().equals("BottomRightButton")) {
                    buttons.get(8).setText(detailed.get(i).getContent());
                    System.out.println("9");
                }
            }
            setDisable();
            i++;
        });
    }

//====================================================================
    public void setComputerChoice() {
    }

    public void setPosition(int position) {
    }

    public void GameSession() {
    }

}
