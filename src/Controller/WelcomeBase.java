package Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class WelcomeBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final Text txt_name;
    protected final Button btnWithComputer;
    protected final Button btnWithFriends;
    protected final Button btnOnline;
    protected final ImageView img_computer;
    protected final ImageView img_friends;
    protected final ImageView img_online;
    protected final Text txt_play;
    protected final ImageView img_icon;
    protected final Button btnBack;
    protected final ImageView imgBack;
    protected final Glow glow;
    protected Navigation nav;
    protected PopUp pop;
    protected final Button btnRecordList;
    protected final ImageView imgRecordList;
    protected final Glow glow0;
    public WelcomeBase() {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        txt_name = new Text();
        btnWithComputer = new Button();
        btnWithFriends = new Button();
        btnOnline = new Button();
        img_computer = new ImageView();
        img_friends = new ImageView();
        img_online = new ImageView();
        txt_play = new Text();
        img_icon = new ImageView();
        btnBack = new Button();
        imgBack = new ImageView();
        glow = new Glow();
        nav = new Navigation();
        pop = new PopUp();
        btnRecordList = new Button();
        imgRecordList = new ImageView();
        glow0 = new Glow();

        setId("welcomScreen");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(402.0);
        setPrefWidth(600.0);
        getStyleClass().add("img");
        getStylesheets().add("/assets/style.css");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(194.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(60.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(222.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(126.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(348.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(257.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(185.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(128.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(145.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(76.0);

        rowConstraints.setMaxHeight(126.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(109.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(124.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(75.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(132.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(92.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(162.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(70.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(117.0);
        rowConstraints3.setMinHeight(0.0);
        rowConstraints3.setPrefHeight(46.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMaxHeight(117.0);
        rowConstraints4.setMinHeight(0.0);
        rowConstraints4.setPrefHeight(0.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMaxHeight(125.0);
        rowConstraints5.setMinHeight(0.0);
        rowConstraints5.setPrefHeight(0.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMaxHeight(125.0);
        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(24.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(txt_name, 2);
        GridPane.setHalignment(txt_name, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(txt_name, javafx.geometry.VPos.CENTER);
        txt_name.setFill(javafx.scene.paint.Color.valueOf("#ffff"));
        
        txt_name.setLineSpacing(7.0);
        txt_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_name.setStrokeWidth(0.0);
        txt_name.setText("Tic Tac Toe");
        txt_name.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        txt_name.setWrappingWidth(181.13671875);
        txt_name.setFont(new Font("Bodoni MT", 32.0));
        txt_name.getStyleClass().add("txt");
        
        //txt_name.setFill(Color.white);
      
//=================================================
        GridPane.setColumnIndex(btnWithComputer, 2);
        GridPane.setRowIndex(btnWithComputer, 1);
        btnWithComputer.setId("withComputerButt");
        btnWithComputer.setMnemonicParsing(false);
        btnWithComputer.setPrefHeight(42.0);
        btnWithComputer.setPrefWidth(221.0);
        btnWithComputer.setText(" With Computer");
        btnWithComputer.setFont(new Font("Colonna MT", 24.0));

        btnWithComputer.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigateToLevelScreen();
            }
        });
//===================================
        GridPane.setColumnIndex(btnWithFriends, 2);
        GridPane.setRowIndex(btnWithFriends, 2);
        btnWithFriends.setId("withFriendButt");
        btnWithFriends.setMnemonicParsing(false);
        btnWithFriends.setPrefHeight(42.0);
        btnWithFriends.setPrefWidth(221.0);
        btnWithFriends.setText(" With Friends");
        btnWithFriends.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigateTowithFriendsScreen();
            }
        });
//===================================================
        GridPane.setColumnIndex(btnOnline, 2);
        GridPane.setRowIndex(btnOnline, 3);
        btnOnline.setId("onlineButt");
        btnOnline.setMnemonicParsing(false);
        btnOnline.setPrefHeight(42.0);
        btnOnline.setPrefWidth(221.0);
        btnOnline.setText("Play OnLine");
        btnOnline.setFont(new Font("Colonna MT", 24.0));

        btnOnline.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigateToRegistrationScreen();
            }
        });
//===============================================
        GridPane.setColumnIndex(img_computer, 3);
        GridPane.setRowIndex(img_computer, 1);
        img_computer.setFitHeight(92.0);
        img_computer.setFitWidth(82.0);
        img_computer.setPickOnBounds(true);
        img_computer.setPreserveRatio(true);
        try {
            img_computer.setImage(new Image(getClass().getResource("/assets/programmer.png").toExternalForm()));
        } catch (Exception e) {
        }
//===========================================
        GridPane.setColumnIndex(img_friends, 3);
        GridPane.setRowIndex(img_friends, 2);
        img_friends.setFitHeight(106.0);
        img_friends.setFitWidth(103.0);
        img_friends.setPickOnBounds(true);
        img_friends.setPreserveRatio(true);
        try {
            img_friends.setImage(new Image(getClass().getResource("/assets/friends2.png").toExternalForm()));
        } catch (Exception e) {
        }
//==================================================
        GridPane.setColumnIndex(img_online, 3);
        GridPane.setRowIndex(img_online, 3);
        img_online.setFitHeight(88.0);
        img_online.setFitWidth(74.0);
        img_online.setPickOnBounds(true);
        img_online.setPreserveRatio(true);
        try {
            img_online.setImage(new Image(getClass().getResource("/assets/online-game.png").toExternalForm()));
        } catch (Exception e) {
        }
//=======================================================
        GridPane.setColumnIndex(txt_play, 3);
        txt_play.setFill(javafx.scene.paint.Color.valueOf("#ffff"));
        txt_play.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        txt_play.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_play.setStrokeWidth(0.0);
        txt_play.setText("Let's Play..");
        txt_play.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        txt_play.setWrappingWidth(149.13671875);
        txt_play.setFont(new Font("Forte", 23.0));
//================================================
        GridPane.setColumnIndex(img_icon, 1);
        img_icon.setFitHeight(93.0);
        img_icon.setFitWidth(382.0);
        img_icon.setPickOnBounds(true);
        img_icon.setPreserveRatio(true);
        try {
            img_icon.setImage(new Image(getClass().getResource("/assets/tic8.png").toExternalForm()));
        } catch (Exception e) {
        }
//====================================================
        GridPane.setColumnIndex(btnBack, 1);
        GridPane.setRowIndex(btnBack, 4);
        btnBack.setAlignment(javafx.geometry.Pos.CENTER);
        btnBack.setMnemonicParsing(false);
        btnBack.setPrefHeight(45.0);
        btnBack.setPrefWidth(46.0);

        btnBack.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pop.closeTheGame();
            }
        });
//===========================================================
        imgBack.setFitHeight(37.0);
        imgBack.setFitWidth(71.0);
        imgBack.setPickOnBounds(true);
        imgBack.setPreserveRatio(true);
        try {
            imgBack.setImage(new Image(getClass().getResource("/assets/logout.png").toExternalForm()));
        } catch (Exception e) {
        }
        btnBack.setGraphic(imgBack);
        btnBack.setEffect(glow);
        //  getStylesheets().add("/assets/style.css");
        
        GridPane.setColumnIndex(btnRecordList, 3);
        GridPane.setHalignment(btnRecordList, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(btnRecordList, 4);
        btnRecordList.setAlignment(javafx.geometry.Pos.CENTER);
        btnRecordList.setMnemonicParsing(false);
        btnRecordList.setPrefHeight(45.0);
        btnRecordList.setPrefWidth(46.0);
btnRecordList.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigateToRecordescreen(); //To change body of generated methods, choose Tools | Templates.
            }
        });
        //=============================================================================================
        imgRecordList.setFitHeight(37.0);
        imgRecordList.setFitWidth(71.0);
        imgRecordList.setPickOnBounds(true);
        imgRecordList.setPreserveRatio(true);
        imgRecordList.setImage(new Image(getClass().getResource("/assets/folder.png").toExternalForm()));
        btnRecordList.setGraphic(imgRecordList);

        btnRecordList.setEffect(glow0);
        GridPane.setMargin(btnRecordList, new Insets(0.0));

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getColumnConstraints().add(columnConstraints2);
        getColumnConstraints().add(columnConstraints3);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getChildren().add(txt_name);
        getChildren().add(btnWithComputer);
        getChildren().add(btnWithFriends);
        getChildren().add(btnOnline);
        getChildren().add(img_computer);
        getChildren().add(img_friends);
        getChildren().add(img_online);
        getChildren().add(txt_play);
        getChildren().add(img_icon);
        getChildren().add(btnBack);
        getChildren().add(btnRecordList);
//==============================================================
        btnBack.getStyleClass().add("but");
        btnBack.getStylesheets().add("/assets/style.css");
        
        btnWithComputer.getStyleClass().add("border");
        btnWithComputer.getStylesheets().add("/assets/style.css");
        btnWithComputer.setFont(new Font("Colonna MT", 24.0));
        
        btnWithFriends.getStyleClass().add("border");
        btnWithFriends.setFont(new Font("Colonna MT", 26.0));
      
        btnOnline.getStyleClass().add("border");
        btnOnline.getStylesheets().add("/assets/style.css");
        
        btnRecordList.getStyleClass().add("but");
        btnRecordList.getStylesheets().add("/assets/style.css");

    }

}
