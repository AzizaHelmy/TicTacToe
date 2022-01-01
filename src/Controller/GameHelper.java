/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.util.Random;
import java.util.Vector;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

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
    boolean isWinn = false;

    protected String Player1Score;
    protected String Player2Score;
    protected Label player1Name;
    protected Label player2Name;

    protected Vector<Button> buttons = new Vector<>();
    protected Vector<ImageView> imags = new Vector<>();
    protected Vector<Label> labels = new Vector<>();

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
    }
//=================================================================

    public void setPlayingIcon(ImageView imageView, Button button) {
        imageView.setVisible(true);
        imageView.setImage(changingTurn(changeTurn, button));
        button.setDisable(true);
        changeTurn = !changeTurn;
        isWinning(player1);
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
            return true;
        } else {
            return false;
        }
    }
//================================================================

    public void WinnerWinnerChickenDinner() {
        counter++;
        if (isWinning(player1)) {
            score1++;
            // annimation();
            setDisable();
            buttons.get(9).setVisible(true);
            labels.get(2).setText("" + score1);
        } else if (isWinning(player2)) {
            score2++;
            // annimation();
            setDisable();
            buttons.get(9).setVisible(true);
            labels.get(3).setText("" + score2);
        } else if (counter == 9) {
            buttons.get(9).setVisible(true);
        }
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

        for (int i = 0; i < imags.size(); i++) {
            imags.get(i).setImage(null);
            imags.get(i).setVisible(false);
        }

        for (int i = 0; i < buttons.size()-2; i++) {
            buttons.get(i).setText("");
            buttons.get(i).setDisable(false);
            buttons.get(i).setVisible(true);
        }

        counter = 0;
        changeTurn = true;
        isWinn = false;
    }
//==================================================

    public void setComputerChoice() {
    }
}
