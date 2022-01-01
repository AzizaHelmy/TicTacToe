package Controller;

import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
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

        setId("welcomScreen");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(402.0);
        setPrefWidth(600.0);
        getStyleClass().add("cardpane");

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
        txt_name.setLineSpacing(7.0);
        txt_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_name.setStrokeWidth(0.0);
        txt_name.setText("Tic Tac Toe");
        txt_name.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        txt_name.setWrappingWidth(181.13671875);
        txt_name.setFont(new Font("Bodoni MT", 32.0));
//=================================================
        GridPane.setColumnIndex(btnWithComputer, 2);
        GridPane.setRowIndex(btnWithComputer, 1);
        btnWithComputer.setId("withComputerButt");
        btnWithComputer.setMnemonicParsing(false);
        btnWithComputer.setPrefHeight(42.0);
        btnWithComputer.setPrefWidth(221.0);
        btnWithComputer.getStyleClass().add("anchor");
        btnWithComputer.setText(" With Computer");
        btnWithComputer.setFont(new Font("Colonna MT", 24.0));
        btnWithComputer.getStylesheets().add("/Welcome/welcome.css");
        btnWithComputer.getStylesheets().add("/Welcome/welcome.css");
        btnWithComputer.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.navigateToLevelScreen(event);
            }
        });
//===================================
        GridPane.setColumnIndex(btnWithFriends, 2);
        GridPane.setRowIndex(btnWithFriends, 2);
        btnWithFriends.setId("withFriendButt");
        btnWithFriends.setMnemonicParsing(false);
        btnWithFriends.setPrefHeight(42.0);
        btnWithFriends.setPrefWidth(221.0);
        btnWithFriends.getStyleClass().add("anchor");
        btnWithFriends.getStylesheets().add("/Welcome/welcome.css");
        btnWithFriends.setText(" With Friends");
        btnWithFriends.setFont(new Font("Colonna MT", 26.0));
        btnWithFriends.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.navigateTowithFriendsScreen(event);
            }
        });
//===================================================
        GridPane.setColumnIndex(btnOnline, 2);
        GridPane.setRowIndex(btnOnline, 3);
        btnOnline.setId("onlineButt");
        btnOnline.setMnemonicParsing(false);
        btnOnline.setPrefHeight(42.0);
        btnOnline.setPrefWidth(221.0);
        btnOnline.getStyleClass().add("anchor");
        btnOnline.setText("Play OnLine");
        btnOnline.setFont(new Font("Colonna MT", 24.0));
        btnOnline.getStylesheets().add("/Welcome/../PlayWithFriend/withfriend.css");
        btnOnline.getStylesheets().add("/Welcome/welcome.css");
        btnOnline.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.navigateToLoginScreen(event);
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
            img_friends.setImage(new Image(getClass().getResource("/assets/icons8-user-groups-100.png").toExternalForm()));
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
        txt_play.setFill(javafx.scene.paint.Color.valueOf("#04062f"));
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
        img_icon.setFitWidth(82.0);
        img_icon.setPickOnBounds(true);
        img_icon.setPreserveRatio(true);
        try {
            img_icon.setImage(new Image(getClass().getResource("/assets/arcade-game.png").toExternalForm()));
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
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);
                alert.setTitle("Exit");
                alert.setHeaderText("Are you Sure that you need to exit?");
                alert.getButtonTypes().setAll(yes,no);
                Optional<ButtonType>result=alert.showAndWait();
                if(result.get()==yes){
                    System.exit(0);
                
                }
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
        getStylesheets().add("/Welcome/welcome.css");
        getStylesheets().add("/Welcome/../PlayWithFriend/withfriend.css");

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

    }

}
