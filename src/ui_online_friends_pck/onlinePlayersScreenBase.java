package ui_online_friends_pck;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import tictactoe.ViewSCreen;
import static tictactoe.ViewSCreen.gameScreen;
import static tictactoe.ViewSCreen.login;
import static tictactoe.ViewSCreen.welcomescreen;

public  class onlinePlayersScreenBase extends BorderPane {

    protected final GridPane mainGridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final ListView listViewTopPlayers;
    protected final ListView listViewOnlinePlayers;
    protected final GridPane gridPaneOnlinePlayers;
    protected final ColumnConstraints columnConstraints4;
    protected final ColumnConstraints columnConstraints5;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final Rectangle recOnlinePlayers;
    protected final ImageView imgOnline;
    protected final Text txtOnlinePlayers;
    protected final GridPane gridPaneTopPlayers;
    protected final ColumnConstraints columnConstraints6;
    protected final ColumnConstraints columnConstraints7;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    protected final Rectangle recTopPlayer;
    protected final Text txtTopPlayer;
    protected final ImageView imgTopPlayer;
    protected final Button btnBack;
    protected final ImageView imgBack;
    protected final Glow glow;
    protected final Button btnSignOut;
    protected final ImageView imgSignOut;

    public onlinePlayersScreenBase() {

        mainGridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        listViewTopPlayers = new ListView();
        listViewOnlinePlayers = new ListView();
        gridPaneOnlinePlayers = new GridPane();
        columnConstraints4 = new ColumnConstraints();
        columnConstraints5 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        recOnlinePlayers = new Rectangle();
        imgOnline = new ImageView();
        txtOnlinePlayers = new Text();
        gridPaneTopPlayers = new GridPane();
        columnConstraints6 = new ColumnConstraints();
        columnConstraints7 = new ColumnConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        recTopPlayer = new Rectangle();
        txtTopPlayer = new Text();
        imgTopPlayer = new ImageView();
        btnBack = new Button();
        imgBack = new ImageView();
        glow = new Glow();
        btnSignOut = new Button();
        imgSignOut = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(mainGridPane, javafx.geometry.Pos.CENTER);
        mainGridPane.setAlignment(javafx.geometry.Pos.CENTER);
        mainGridPane.setPrefHeight(550.0);
        mainGridPane.setPrefWidth(600.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(193.0);
        columnConstraints.setMinWidth(0.0);
        columnConstraints.setPrefWidth(21.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(290.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(262.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(271.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(51.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(548.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(199.0);

        columnConstraints3.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(79.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(31.0);

        rowConstraints.setMaxHeight(129.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(71.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(286.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(219.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(101.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(101.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(listViewTopPlayers, 3);
        GridPane.setHgrow(listViewTopPlayers, javafx.scene.layout.Priority.NEVER);
        GridPane.setRowIndex(listViewTopPlayers, 1);
        GridPane.setVgrow(listViewTopPlayers, javafx.scene.layout.Priority.NEVER);
        listViewTopPlayers.setPrefHeight(200.0);
        listViewTopPlayers.setPrefWidth(200.0);

        GridPane.setColumnIndex(listViewOnlinePlayers, 1);
        GridPane.setRowIndex(listViewOnlinePlayers, 1);
        listViewOnlinePlayers.setFixedCellSize(0.0);
        listViewOnlinePlayers.setPrefHeight(200.0);
        listViewOnlinePlayers.setPrefWidth(200.0);

        GridPane.setColumnIndex(gridPaneOnlinePlayers, 1);
        gridPaneOnlinePlayers.setPrefHeight(76.0);
        gridPaneOnlinePlayers.setPrefWidth(392.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMaxWidth(210.0);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(210.0);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMaxWidth(130.0);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(61.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(recOnlinePlayers, 1);
        recOnlinePlayers.setArcHeight(5.0);
        recOnlinePlayers.setArcWidth(5.0);
        recOnlinePlayers.setHeight(60.0);
        recOnlinePlayers.setStroke(javafx.scene.paint.Color.BLACK);
        recOnlinePlayers.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        recOnlinePlayers.setWidth(206.0);

        GridPane.setColumnIndex(imgOnline, 1);
        GridPane.setRowIndex(imgOnline, 1);
        imgOnline.setFitHeight(44.0);
        imgOnline.setFitWidth(81.0);
        imgOnline.setPickOnBounds(true);
        imgOnline.setPreserveRatio(true);
        try {
           imgOnline.setImage(new Image(getClass().getResource("/assets/online.png").toExternalForm())); 
        } catch (Exception e) {
           
        }
 

        GridPane.setHalignment(txtOnlinePlayers, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(txtOnlinePlayers, 1);
        txtOnlinePlayers.setFill(javafx.scene.paint.Color.WHITE);
        txtOnlinePlayers.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txtOnlinePlayers.setStrokeWidth(0.0);
        txtOnlinePlayers.setText("Onilne Players");
        txtOnlinePlayers.setFont(new Font("System Bold", 21.0));

        GridPane.setColumnIndex(gridPaneTopPlayers, 3);

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMaxWidth(176.0);
        columnConstraints6.setMinWidth(10.0);
        columnConstraints6.setPrefWidth(164.0);

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMaxWidth(99.0);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(47.0);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(30.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(recTopPlayer, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(recTopPlayer, 1);
        recTopPlayer.setArcHeight(5.0);
        recTopPlayer.setArcWidth(5.0);
        recTopPlayer.setHeight(60.0);
        recTopPlayer.setStroke(javafx.scene.paint.Color.BLACK);
        recTopPlayer.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        recTopPlayer.setWidth(164.0);

        GridPane.setHalignment(txtTopPlayer, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(txtTopPlayer, 1);
        txtTopPlayer.setFill(javafx.scene.paint.Color.valueOf("#dbe129"));
        txtTopPlayer.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txtTopPlayer.setStrokeWidth(0.0);
        txtTopPlayer.setText("Top Players");
        txtTopPlayer.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        txtTopPlayer.setFont(new Font("System Bold", 21.0));

        GridPane.setColumnIndex(imgTopPlayer, 1);
        GridPane.setRowIndex(imgTopPlayer, 1);
        imgTopPlayer.setFitHeight(39.0);
        imgTopPlayer.setFitWidth(50.0);
        imgTopPlayer.setPickOnBounds(true);
        imgTopPlayer.setPreserveRatio(true);
        try {
            imgTopPlayer.setImage(new Image(getClass().getResource("/assets/top.png").toExternalForm()));
        } catch (Exception e) {
        }

        GridPane.setColumnIndex(btnBack, 1);
        GridPane.setRowIndex(btnBack, 2);
        btnBack.setAlignment(javafx.geometry.Pos.CENTER);
        btnBack.setMnemonicParsing(false);
        btnBack.setPrefHeight(37.0);
        btnBack.setPrefWidth(98.0);
        btnBack.setText("Back");

        imgBack.setFitHeight(37.0);
        imgBack.setFitWidth(71.0);
        imgBack.setPickOnBounds(true);
        imgBack.setPreserveRatio(true);
        try {
            imgBack.setImage(new Image(getClass().getResource("/assets/icons8-back-64.png").toExternalForm()));
        } catch (Exception e) {
        }
        btnBack.setGraphic(imgBack);

        btnBack.setEffect(glow);

        GridPane.setColumnIndex(btnSignOut, 3);
        GridPane.setHalignment(btnSignOut, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(btnSignOut, 2);
        btnSignOut.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
        btnSignOut.setMnemonicParsing(false);
        btnSignOut.setPrefHeight(41.0);
        btnSignOut.setPrefWidth(206.0);
        btnSignOut.setText("Sign Out");

        imgSignOut.setFitHeight(40.0);
        imgSignOut.setFitWidth(79.0);
        imgSignOut.setPickOnBounds(true);
        imgSignOut.setPreserveRatio(true);
        try {
            imgSignOut.setImage(new Image(getClass().getResource("/assets/signOut.png").toExternalForm()));
        } catch (Exception e) {
        }
        btnSignOut.setGraphic(imgSignOut);
        setCenter(mainGridPane);

        mainGridPane.getColumnConstraints().add(columnConstraints);
        mainGridPane.getColumnConstraints().add(columnConstraints0);
        mainGridPane.getColumnConstraints().add(columnConstraints1);
        mainGridPane.getColumnConstraints().add(columnConstraints2);
        mainGridPane.getColumnConstraints().add(columnConstraints3);
        mainGridPane.getRowConstraints().add(rowConstraints);
        mainGridPane.getRowConstraints().add(rowConstraints0);
        mainGridPane.getRowConstraints().add(rowConstraints1);
        mainGridPane.getChildren().add(listViewTopPlayers);
        mainGridPane.getChildren().add(listViewOnlinePlayers);
        gridPaneOnlinePlayers.getColumnConstraints().add(columnConstraints4);
        gridPaneOnlinePlayers.getColumnConstraints().add(columnConstraints5);
        gridPaneOnlinePlayers.getRowConstraints().add(rowConstraints2);
        gridPaneOnlinePlayers.getRowConstraints().add(rowConstraints3);
        gridPaneOnlinePlayers.getRowConstraints().add(rowConstraints4);
        gridPaneOnlinePlayers.getChildren().add(recOnlinePlayers);
        gridPaneOnlinePlayers.getChildren().add(imgOnline);
        gridPaneOnlinePlayers.getChildren().add(txtOnlinePlayers);
        mainGridPane.getChildren().add(gridPaneOnlinePlayers);
        gridPaneTopPlayers.getColumnConstraints().add(columnConstraints6);
        gridPaneTopPlayers.getColumnConstraints().add(columnConstraints7);
        gridPaneTopPlayers.getRowConstraints().add(rowConstraints5);
        gridPaneTopPlayers.getRowConstraints().add(rowConstraints6);
        gridPaneTopPlayers.getRowConstraints().add(rowConstraints7);
        gridPaneTopPlayers.getChildren().add(recTopPlayer);
        gridPaneTopPlayers.getChildren().add(txtTopPlayer);
        gridPaneTopPlayers.getChildren().add(imgTopPlayer);
        mainGridPane.getChildren().add(gridPaneTopPlayers);
        mainGridPane.getChildren().add(btnBack);
        mainGridPane.getChildren().add(btnSignOut);
btnBack.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ViewSCreen.view(welcomescreen);
            }
        });
btnSignOut.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ViewSCreen.view(login);
            }
        });
    }
}
