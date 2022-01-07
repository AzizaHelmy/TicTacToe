package Controller;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.SocketException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import model.Move;

public class GamePlayScreenBase extends BorderPane {

    protected final GridPane infomationPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;

    protected final Label player1Name;
    protected final ImageView player1Image;
    protected final Label player2Name;
    protected final ImageView player2Image;
    protected final Label scoreLabel;
    protected final Label colonLabel;
    protected final Label player1Score;
    protected final Label player2Score;
    protected final ImageView player1PlayingLogo;
    protected final ImageView player2PlayingLogo;
    protected final GridPane playingPane;
    protected final ColumnConstraints columnConstraints4;
    protected final ColumnConstraints columnConstraints5;
    protected final ColumnConstraints columnConstraints6;
    protected final ColumnConstraints columnConstraints7;
    protected final ColumnConstraints columnConstraints8;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;

    protected final AnchorPane xoPane;
    protected final Button topRight;
    protected final ImageView topRightIcon;
    protected final Button centerRight;
    protected final ImageView centerRightIcon;
    protected final Button bottomRight;
    protected final ImageView bottomRightIcon;
    protected final Button topCenter;
    protected final ImageView topCenterIcon;
    protected final Button centerCenter;
    protected final ImageView centerCenterIcon;
    protected final Button bottomCenter;
    protected final ImageView bottomCenterIcon;
    protected final Button topLeft;
    protected final ImageView topLeftIcon;
    protected final Button centerLeft;
    protected final ImageView centerLeftIcon;
    protected final Button bottomLeft;
    protected final ImageView bottomLeftIcon;
    protected final Button btnRestart;
    protected final ImageView imageView;
    protected final Button btnExit;
    protected final ImageView imageView0;

    protected Image first;
    protected Image second;

    protected String player1;
    protected String player2;

    protected Vector<Button> buttons;
    protected Vector<ImageView> imgs;
    protected Vector<Label> labels;

    protected Navigation nav;

    protected PopUp pop;

    protected Move move;
    protected ObjectInputStream objectInputStream;
    protected ObjectOutputStream objectOutputStream;

    public GamePlayScreenBase(GameHelper g) {

        buttons = new Vector<>();
        imgs = new Vector<>();
        labels = new Vector<>();

        infomationPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        player1Name = new Label();
        player1Image = new ImageView();
        player2Name = new Label();
        player2Image = new ImageView();
        scoreLabel = new Label();
        colonLabel = new Label();
        player1Score = new Label();
        player2Score = new Label();
        player1PlayingLogo = new ImageView();
        player2PlayingLogo = new ImageView();
        playingPane = new GridPane();
        columnConstraints4 = new ColumnConstraints();
        columnConstraints5 = new ColumnConstraints();
        columnConstraints6 = new ColumnConstraints();
        columnConstraints7 = new ColumnConstraints();
        columnConstraints8 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        xoPane = new AnchorPane();
        topRight = new Button();
        topRightIcon = new ImageView();
        centerRight = new Button();
        centerRightIcon = new ImageView();
        bottomRight = new Button();
        bottomRightIcon = new ImageView();
        topCenter = new Button();
        topCenterIcon = new ImageView();
        centerCenter = new Button();
        centerCenterIcon = new ImageView();
        bottomCenter = new Button();
        bottomCenterIcon = new ImageView();
        topLeft = new Button();
        topLeftIcon = new ImageView();
        centerLeft = new Button();
        centerLeftIcon = new ImageView();
        bottomLeft = new Button();
        bottomLeftIcon = new ImageView();
        btnRestart = new Button();
        imageView = new ImageView();
        btnExit = new Button();
        imageView0 = new ImageView();
        pop = new PopUp();

        nav = new Navigation();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        getStyleClass().add("img");
        getStylesheets().add("/assets/style.css");

        BorderPane.setAlignment(infomationPane, javafx.geometry.Pos.CENTER);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(player1Name, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(player1Name, 1);
        GridPane.setValignment(player1Name, javafx.geometry.VPos.CENTER);

        player1Image.setFitHeight(42.0);
        player1Image.setFitWidth(43.0);
        player1Image.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        player1Image.setPickOnBounds(true);
        player1Image.setPreserveRatio(true);
        player1Name.setGraphic(player1Image);
        player1Name.setFont(new Font("Book Antiqua", 21.0));
        player1Name.setTextFill(javafx.scene.paint.Color.valueOf("#ffff"));
        GridPane.setColumnIndex(player2Name, 4);
        GridPane.setHalignment(player2Name, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(player2Name, 1);

        GridPane.setValignment(player2Name, javafx.geometry.VPos.CENTER);
        player2Name.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);

        player2Image.setFitHeight(42.0);
        player2Image.setFitWidth(43.0);
        player2Image.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        player2Image.setPickOnBounds(true);
        player2Image.setPreserveRatio(true);

        try {
            if (g instanceof ComputerEasyLevel) {
                player1Image.setImage(new Image(getClass().getResource("/assets/you.png").toExternalForm()));
                player2Image.setImage(new Image(getClass().getResource("/assets/compute.png").toExternalForm()));

                player2Name.setText("Computer");
                player1Name.setText("You");
            } else if (g instanceof LocalGame) {
                player1Image.setImage(new Image(getClass().getResource("/assets/player1.png").toExternalForm()));
                player2Image.setImage(new Image(getClass().getResource("/assets/player2.png").toExternalForm()));

                player1Name.setText(WithFriendBase.nameOfPlayer1);
                player2Name.setText(WithFriendBase.nameOfPlayer2);

            } else {
                player1Image.setImage(new Image(getClass().getResource("/assets/player1.png").toExternalForm()));
                player2Image.setImage(new Image(getClass().getResource("/assets/player2.png").toExternalForm()));

                player1Name.setText(onlinePlayersScreenBase.nameOfPlayer1);
                player2Name.setText(onlinePlayersScreenBase.nameOfPlayer2);
            }
        } catch (Exception e) {
            System.out.println("can't load player images");
        }
        player2Name.setGraphic(player2Image);
        player2Name.setFont(new Font("Book Antiqua", 21.0));
        player2Name.setTextFill(javafx.scene.paint.Color.valueOf("#ffff"));
        GridPane.setColumnIndex(scoreLabel, 2);
        GridPane.setHalignment(scoreLabel, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(scoreLabel, 1);
        GridPane.setValignment(scoreLabel, javafx.geometry.VPos.CENTER);
        scoreLabel.setText("Score");
        scoreLabel.setFont(new Font("Book Antiqua", 27.0));
        scoreLabel.setTextFill(javafx.scene.paint.Color.valueOf("#ffff"));

        GridPane.setColumnIndex(colonLabel, 2);
        GridPane.setHalignment(colonLabel, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(colonLabel, 2);
        GridPane.setValignment(colonLabel, javafx.geometry.VPos.CENTER);
        colonLabel.setText(":");
        colonLabel.setFont(new Font(16.0));

        GridPane.setColumnIndex(player1Score, 1);
        GridPane.setHalignment(player1Score, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(player1Score, 2);
        GridPane.setValignment(player1Score, javafx.geometry.VPos.CENTER);
        player1Score.setText("0");
        // player1Score.setTextFill(javafx.scene.paint.Color.valueOf("#1800f5"));

        player1Score.setTextFill(javafx.scene.paint.Color.valueOf("#FFCC1D"));
        player1Score.setFont(new Font(19.0));

        GridPane.setColumnIndex(player2Score, 3);
        GridPane.setRowIndex(player2Score, 2);
        player2Score.setText("0");
        player2Score.setTextFill(javafx.scene.paint.Color.RED);
        player2Score.setFont(new Font(19.0));

        GridPane.setHalignment(player1PlayingLogo, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(player1PlayingLogo, 2);
        GridPane.setValignment(player1PlayingLogo, javafx.geometry.VPos.TOP);
        player1PlayingLogo.setFitHeight(61.0);
        player1PlayingLogo.setFitWidth(68.0);
        player1PlayingLogo.setPickOnBounds(true);
        player1PlayingLogo.setPreserveRatio(true);
        GridPane.setMargin(player1PlayingLogo, new Insets(10.0, 0.0, 0.0, 0.0));
        //player1PlayingLogo.setImage(first);

        GridPane.setColumnIndex(player2PlayingLogo, 4);
        GridPane.setHalignment(player2PlayingLogo, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(player2PlayingLogo, 2);
        GridPane.setValignment(player2PlayingLogo, javafx.geometry.VPos.TOP);
        player2PlayingLogo.setFitHeight(61.0);
        player2PlayingLogo.setFitWidth(68.0);
        player2PlayingLogo.setPickOnBounds(true);
        player2PlayingLogo.setPreserveRatio(true);
        GridPane.setMargin(player2PlayingLogo, new Insets(10.0, 0.0, 0.0, 0.0));
        //player2PlayingLogo.setImage(second);
        setTop(infomationPane);

        BorderPane.setAlignment(playingPane, javafx.geometry.Pos.CENTER);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(100.0);

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMinWidth(10.0);
        columnConstraints6.setPrefWidth(100.0);

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(100.0);

        columnConstraints8.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints8.setMinWidth(10.0);
        columnConstraints8.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(xoPane, 2);
        GridPane.setHalignment(xoPane, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(xoPane, 1);
        GridPane.setValignment(xoPane, javafx.geometry.VPos.CENTER);
        xoPane.setPrefHeight(200.0);
        xoPane.setPrefWidth(200.0);

        topRight.setAlignment(javafx.geometry.Pos.CENTER);
        topRight.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        topRight.setLayoutX(171.0);
        topRight.setLayoutY(1.0);
        topRight.setMnemonicParsing(false);
        topRight.setPrefHeight(71.0);
        topRight.setPrefWidth(79.0);
        topRight.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        topRight.setTextFill(javafx.scene.paint.Color.WHITE);
        topRight.setFont(Font.font(1.0));

        topRightIcon.setDisable(true);
        topRightIcon.setFitHeight(60.0);
        topRightIcon.setFitWidth(60.0);
        topRightIcon.setPickOnBounds(true);
        topRightIcon.setPreserveRatio(true);
        topRightIcon.setVisible(false);
        topRight.setGraphic(topRightIcon);

        centerRight.setAlignment(javafx.geometry.Pos.CENTER);
        centerRight.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        centerRight.setLayoutX(171.0);
        centerRight.setLayoutY(80.0);
        centerRight.setMnemonicParsing(false);
        centerRight.setPrefHeight(71.0);
        centerRight.setPrefWidth(79.0);
        centerRight.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        centerRight.setTextFill(javafx.scene.paint.Color.WHITE);
        centerRight.setFont(Font.font(1.0));

        centerRightIcon.setDisable(true);
        centerRightIcon.setFitHeight(60.0);
        centerRightIcon.setFitWidth(60.0);
        centerRightIcon.setPickOnBounds(true);
        centerRightIcon.setPreserveRatio(true);
        centerRightIcon.setVisible(false);
        centerRight.setGraphic(centerRightIcon);

        bottomRight.setAlignment(javafx.geometry.Pos.CENTER);
        bottomRight.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        bottomRight.setLayoutX(171.0);
        bottomRight.setLayoutY(160.0);
        bottomRight.setMnemonicParsing(false);
        bottomRight.setPrefHeight(71.0);
        bottomRight.setPrefWidth(79.0);
        bottomRight.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bottomRight.setTextFill(javafx.scene.paint.Color.WHITE);
        bottomRight.setFont(Font.font(1.0));

        bottomRightIcon.setDisable(true);
        bottomRightIcon.setFitHeight(60.0);
        bottomRightIcon.setFitWidth(60.0);
        bottomRightIcon.setPickOnBounds(true);
        bottomRightIcon.setPreserveRatio(true);
        bottomRightIcon.setVisible(false);
        bottomRight.setGraphic(bottomRightIcon);

        topCenter.setAlignment(javafx.geometry.Pos.CENTER);
        topCenter.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        topCenter.setLayoutX(86.0);
        topCenter.setLayoutY(1.0);
        topCenter.setMnemonicParsing(false);
        topCenter.setPrefHeight(71.0);
        topCenter.setPrefWidth(79.0);
        topCenter.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        topCenter.setTextFill(javafx.scene.paint.Color.WHITE);
        topCenter.setFont(Font.font(1.0));

        topCenterIcon.setDisable(true);
        topCenterIcon.setFitHeight(60.0);
        topCenterIcon.setFitWidth(60.0);
        topCenterIcon.setPickOnBounds(true);
        topCenterIcon.setPreserveRatio(true);
        topCenterIcon.setVisible(false);
        topCenter.setGraphic(topCenterIcon);

        centerCenter.setAlignment(javafx.geometry.Pos.CENTER);
        centerCenter.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        centerCenter.setLayoutX(86.0);
        centerCenter.setLayoutY(80.0);
        centerCenter.setMnemonicParsing(false);
        centerCenter.setPrefHeight(71.0);
        centerCenter.setPrefWidth(79.0);
        centerCenter.setTextFill(javafx.scene.paint.Color.WHITE);
        centerCenter.setFont(Font.font(1.0));

        centerCenterIcon.setDisable(true);
        centerCenterIcon.setFitHeight(60.0);
        centerCenterIcon.setFitWidth(60.0);
        centerCenterIcon.setPickOnBounds(true);
        centerCenterIcon.setPreserveRatio(true);
        centerCenterIcon.setVisible(false);
        centerCenter.setGraphic(centerCenterIcon);

        bottomCenter.setAlignment(javafx.geometry.Pos.CENTER);
        bottomCenter.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        bottomCenter.setLayoutX(86.0);
        bottomCenter.setLayoutY(160.0);
        bottomCenter.setMnemonicParsing(false);
        bottomCenter.setPrefHeight(71.0);
        bottomCenter.setPrefWidth(79.0);
        bottomCenter.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bottomCenter.setTextFill(javafx.scene.paint.Color.WHITE);
        bottomCenter.setFont(Font.font(1.0));

        bottomCenterIcon.setDisable(true);
        bottomCenterIcon.setFitHeight(60.0);
        bottomCenterIcon.setFitWidth(60.0);
        bottomCenterIcon.setPickOnBounds(true);
        bottomCenterIcon.setPreserveRatio(true);
        bottomCenterIcon.setVisible(false);
        bottomCenter.setGraphic(bottomCenterIcon);

        topLeft.setAlignment(javafx.geometry.Pos.CENTER);
        topLeft.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        topLeft.setLayoutY(1.0);
        topLeft.setMnemonicParsing(false);
        topLeft.setPrefHeight(71.0);
        topLeft.setPrefWidth(79.0);
        topLeft.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        topLeft.setTextFill(javafx.scene.paint.Color.WHITE);
        topLeft.setFont(Font.font(1.0));

        topLeftIcon.setDisable(true);
        topLeftIcon.setFitHeight(60.0);
        topLeftIcon.setFitWidth(60.0);
        topLeftIcon.setPickOnBounds(true);
        topLeftIcon.setPreserveRatio(true);
        topLeftIcon.setVisible(false);
        topLeft.setGraphic(topLeftIcon);

        centerLeft.setAlignment(javafx.geometry.Pos.CENTER);
        centerLeft.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        centerLeft.setLayoutY(80.0);
        centerLeft.setMnemonicParsing(false);
        centerLeft.setPrefHeight(71.0);
        centerLeft.setPrefWidth(79.0);
        centerLeft.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        centerLeft.setTextFill(javafx.scene.paint.Color.WHITE);
        centerLeft.setFont(Font.font(1.0));

        centerLeftIcon.setDisable(true);
        centerLeftIcon.setFitHeight(60.0);
        centerLeftIcon.setFitWidth(60.0);
        centerLeftIcon.setPickOnBounds(true);
        centerLeftIcon.setPreserveRatio(true);
        centerLeftIcon.setVisible(false);
        centerLeft.setGraphic(centerLeftIcon);

        bottomLeft.setAlignment(javafx.geometry.Pos.CENTER);
        bottomLeft.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        bottomLeft.setLayoutY(160.0);
        bottomLeft.setMnemonicParsing(false);
        bottomLeft.setPrefHeight(71.0);
        bottomLeft.setPrefWidth(79.0);
        bottomLeft.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bottomLeft.setTextFill(javafx.scene.paint.Color.WHITE);
        bottomLeft.setFont(Font.font(1.0));

        bottomLeftIcon.setDisable(true);
        bottomLeftIcon.setFitHeight(60.0);
        bottomLeftIcon.setFitWidth(60.0);
        bottomLeftIcon.setPickOnBounds(true);
        bottomLeftIcon.setPreserveRatio(true);
        bottomLeftIcon.setVisible(false);
        bottomLeft.setGraphic(bottomLeftIcon);
        GridPane.setMargin(xoPane, new Insets(0.0, 0.0, 30.0, 0.0));

        GridPane.setColumnIndex(btnRestart, 4);
        GridPane.setHalignment(btnRestart, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(btnRestart, 2);
        GridPane.setValignment(btnRestart, javafx.geometry.VPos.BOTTOM);
        btnRestart.setAlignment(javafx.geometry.Pos.CENTER);
        btnRestart.setMnemonicParsing(false);
        btnRestart.setPrefHeight(40.0);
        btnRestart.setPrefWidth(100.0);
        btnRestart.setText("Restart");
        btnRestart.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btnRestart.setVisible(false);
        GridPane.setMargin(btnRestart, new Insets(0.0, 20.0, 10.0, 0.0));

        imageView.setFitHeight(37.0);
        imageView.setFitWidth(32.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        try {
            imageView.setImage(new Image(getClass().getResource("/assets/restart.png").toExternalForm()));
        } catch (Exception e) {
        }
        btnRestart.setGraphic(imageView);
        btnRestart.setFont(new Font(13.0));

        GridPane.setRowIndex(btnExit, 2);
        GridPane.setValignment(btnExit, javafx.geometry.VPos.BOTTOM);
        btnExit.setAlignment(javafx.geometry.Pos.CENTER);
        btnExit.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
        btnExit.setMnemonicParsing(false);
        btnExit.setPrefHeight(40.0);
        btnExit.setPrefWidth(100.0);
        btnExit.setText("Exit");
        btnExit.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(btnExit, new Insets(0.0, 0.0, 10.0, 20.0));
        btnExit.setFont(new Font(13.0));

        imageView0.setFitHeight(37.0);
        imageView0.setFitWidth(32.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        try {
            imageView0.setImage(new Image(getClass().getResource("/assets/exit.png").toExternalForm()));
        } catch (Exception e) {
        }
        btnExit.setGraphic(imageView0);
        setCenter(playingPane);

        infomationPane.getColumnConstraints().add(columnConstraints);
        infomationPane.getColumnConstraints().add(columnConstraints0);
        infomationPane.getColumnConstraints().add(columnConstraints1);
        infomationPane.getColumnConstraints().add(columnConstraints2);
        infomationPane.getColumnConstraints().add(columnConstraints3);
        infomationPane.getRowConstraints().add(rowConstraints);
        infomationPane.getRowConstraints().add(rowConstraints0);
        infomationPane.getRowConstraints().add(rowConstraints1);
        infomationPane.getChildren().add(player1Name);
        infomationPane.getChildren().add(player2Name);
        infomationPane.getChildren().add(scoreLabel);
        infomationPane.getChildren().add(colonLabel);
        infomationPane.getChildren().add(player1Score);
        infomationPane.getChildren().add(player2Score);
        infomationPane.getChildren().add(player1PlayingLogo);
        infomationPane.getChildren().add(player2PlayingLogo);
        playingPane.getColumnConstraints().add(columnConstraints4);
        playingPane.getColumnConstraints().add(columnConstraints5);
        playingPane.getColumnConstraints().add(columnConstraints6);
        playingPane.getColumnConstraints().add(columnConstraints7);
        playingPane.getColumnConstraints().add(columnConstraints8);
        playingPane.getRowConstraints().add(rowConstraints2);
        playingPane.getRowConstraints().add(rowConstraints3);
        playingPane.getRowConstraints().add(rowConstraints4);
        xoPane.getChildren().add(topRight);
        xoPane.getChildren().add(centerRight);
        xoPane.getChildren().add(bottomRight);
        xoPane.getChildren().add(topCenter);
        xoPane.getChildren().add(centerCenter);
        xoPane.getChildren().add(bottomCenter);
        xoPane.getChildren().add(topLeft);
        xoPane.getChildren().add(centerLeft);
        xoPane.getChildren().add(bottomLeft);
        playingPane.getChildren().add(xoPane);
        playingPane.getChildren().add(btnRestart);
        playingPane.getChildren().add(btnExit);

        if (g instanceof OnlineGame) {
            try {
                objectOutputStream = ClientSocket.getObjectOutputStreamInstance();
                move = new Move();
                Platform.runLater(() -> {
                    ((OnlineGame) g).GameSession();
                });
                if (OnlineGame.player.getUserName().equals(onlinePlayersScreenBase.nameOfPlayer1)) {
                    xoPane.setDisable(false);
                } else {
                    xoPane.setDisable(true);
                }

            } catch (IOException ex) {
                Logger.getLogger(GamePlayScreenBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        btnExit.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (g instanceof LocalGame) {
                    pop.exitTheGame();
                } else if (g instanceof OnlineGame) {
                    nav.navigateToOnlineScreen(OnlineGame.player);
                } else {
                    pop.exitTheGame();
                }
            }
        });

        btnRestart.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                g.resetting();
                btnRestart.setVisible(false);
            }
        });
//==============================================================
        topLeft.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (g instanceof ComputerEasyLevel) {
                    g.setPlayingIcon(topLeftIcon, topLeft);
                    if (!g.isWinning(player1)) {
                        g.setComputerChoice();
                    }
                } else if (g instanceof OnlineGame) {
                    g.setPosition(0);
                } else if (g instanceof LocalGame) {
                    g.setPlayingIcon(topLeftIcon, topLeft);
                }
                g.checkWinning();
            }
        });
//==============================================================
        topCenter.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (g instanceof ComputerEasyLevel) {
                    g.setPlayingIcon(topCenterIcon, topCenter);
                    if (!g.isWinning(player1)) {
                        g.setComputerChoice();
                    }
                } else if (g instanceof OnlineGame) {
                    g.setPosition(1);
                } else if (g instanceof LocalGame) {
                    g.setPlayingIcon(topCenterIcon, topCenter);
                }
                g.checkWinning();
            }
        });
//==========================================================
        topRight.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (g instanceof ComputerEasyLevel) {
                    g.setPlayingIcon(topRightIcon, topRight);
                    if (!g.isWinning(player1)) {
                        g.setComputerChoice();
                    }
                } else if (g instanceof OnlineGame) {
                    g.setPosition(2);
                } else if (g instanceof LocalGame) {
                    g.setPlayingIcon(topRightIcon, topRight);
                }
                g.checkWinning();
            }
        });
//=============================================================
        centerLeft.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (g instanceof ComputerEasyLevel) {
                    g.setPlayingIcon(centerLeftIcon, centerLeft);
                    if (!g.isWinning(player1)) {
                        g.setComputerChoice();
                    }
                } else if (g instanceof OnlineGame) {
                    g.setPosition(3);
                } else if (g instanceof LocalGame) {
                    g.setPlayingIcon(centerLeftIcon, centerLeft);
                }
                g.checkWinning();
            }
        });
//=========================================================
        centerCenter.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (g instanceof ComputerEasyLevel) {
                    g.setPlayingIcon(centerCenterIcon, centerCenter);
                    if (!g.isWinning(player1)) {
                        g.setComputerChoice();
                    }
                } else if (g instanceof OnlineGame) {
                    g.setPosition(4);
                } else if (g instanceof LocalGame) {
                    g.setPlayingIcon(centerCenterIcon, centerCenter);
                }
                g.checkWinning();
            }
        });
//======================================================
        centerRight.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (g instanceof ComputerEasyLevel) {
                    g.setPlayingIcon(centerRightIcon, centerRight);
                    if (!g.isWinning(player1)) {
                        g.setComputerChoice();
                    }
                } else if (g instanceof OnlineGame) {
                    g.setPosition(5);
                } else if (g instanceof LocalGame) {
                    g.setPlayingIcon(centerRightIcon, centerRight);
                }
                g.checkWinning();
            }
        });
//============================================================
        bottomLeft.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (g instanceof ComputerEasyLevel) {
                    g.setPlayingIcon(bottomLeftIcon, bottomLeft);
                    if (!g.isWinning(player1)) {
                        g.setComputerChoice();
                    }

                } else if (g instanceof OnlineGame) {
                    g.setPosition(6);
                } else if (g instanceof LocalGame) {
                    g.setPlayingIcon(bottomLeftIcon, bottomLeft);
                }
                g.checkWinning();
            }
        });
        //========================================================       
        bottomCenter.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (g instanceof ComputerEasyLevel) {
                    g.setPlayingIcon(bottomCenterIcon, bottomCenter);
                    if (!g.isWinning(player1)) {
                        g.setComputerChoice();
                    }
                } else if (g instanceof OnlineGame) {
                    g.setPosition(7);
                } else if (g instanceof LocalGame) {
                    g.setPlayingIcon(bottomCenterIcon, bottomCenter);
                }
                g.checkWinning();
            }
        });
//===========================================================
        bottomRight.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (g instanceof ComputerEasyLevel) {
                    g.setPlayingIcon(bottomRightIcon, bottomRight);
                    if (!g.isWinning(player1)) {
                        g.setComputerChoice();
                    }
                } else if (g instanceof OnlineGame) {
                    g.setPosition(8);
                } else if (g instanceof LocalGame) {
                    g.setPlayingIcon(bottomRightIcon, bottomRight);
                }
                g.checkWinning();
            }
        });
//===========================================================
        buttons.add(0, topLeft);//0
        buttons.add(1, topCenter);//1
        buttons.add(2, topRight);//2
        buttons.add(3, centerLeft);//3
        buttons.add(4, centerCenter);//4
        buttons.add(5, centerRight);//5
        buttons.add(6, bottomLeft);//6
        buttons.add(7, bottomCenter);//7
        buttons.add(8, bottomRight);//8
        buttons.add(9, btnRestart);//9
        buttons.add(10, btnExit);//10

        imgs.add(0, topLeftIcon);
        imgs.add(1, topCenterIcon);
        imgs.add(2, topRightIcon);
        imgs.add(3, centerLeftIcon);
        imgs.add(4, centerCenterIcon);
        imgs.add(5, centerRightIcon);
        imgs.add(6, bottomLeftIcon);
        imgs.add(7, bottomCenterIcon);
        imgs.add(8, bottomRightIcon);
        imgs.add(9, player1PlayingLogo);
        imgs.add(10, player2PlayingLogo);

        labels.add(0, player1Name);//0       
        labels.add(1, player2Name);//1
        labels.add(2, player1Score);//2
        labels.add(3, player2Score);//3

        g.setButtons(buttons);
        g.setImages(imgs);
        g.setLabels(labels);
        g.setPane(xoPane);
        g.changeXO();
    }
}
