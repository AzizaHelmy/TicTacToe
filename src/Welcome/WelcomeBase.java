package Welcome;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import tictactoe.ViewSCreen;
import static tictactoe.ViewSCreen.friiends;
import static tictactoe.ViewSCreen.levelScreen;
import static tictactoe.ViewSCreen.login;

public  class WelcomeBase extends GridPane {

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
    protected final Text text;
    protected final Button btnWithComputer;
    protected final Button btnWithFriends;
    protected final Button btnOnline;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final Text text0;
    protected final ImageView imageView2;

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
        text = new Text();
        btnWithComputer = new Button();
        btnWithFriends = new Button();
        btnOnline = new Button();
        imageView = new ImageView();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        text0 = new Text();
        imageView2 = new ImageView();

        setId("welcomScreen");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(432.0);
        setPrefWidth(726.0);
        getStylesheets().add("/Welcome/welcome.css");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(194.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(65.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(222.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(123.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(348.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(259.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(185.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(138.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(145.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(145.0);

        rowConstraints.setMaxHeight(126.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(117.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(124.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(97.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(132.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(90.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(162.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(74.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(117.0);
        rowConstraints3.setMinHeight(0.0);
        rowConstraints3.setPrefHeight(34.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(text, 2);
        GridPane.setHalignment(text, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(text, javafx.geometry.VPos.CENTER);
        text.setLineSpacing(7.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tic Tac Toe");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(181.13671875);
        text.setFont(new Font("Bodoni MT", 32.0));
//====================================================
        GridPane.setColumnIndex(btnWithComputer, 2);
        GridPane.setRowIndex(btnWithComputer, 1);
        btnWithComputer.setId("withComputerButt");
        btnWithComputer.setMnemonicParsing(false);
        btnWithComputer.setPrefHeight(42.0);
        btnWithComputer.setPrefWidth(221.0);
        btnWithComputer.getStyleClass().add("anchor");
        btnWithComputer.getStylesheets().add("/Welcome/welcome.css");
        btnWithComputer.setText(" With Computer");
        btnWithComputer.setFont(new Font("Colonna MT", 24.0));
        btnWithComputer.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                 ViewSCreen.view(levelScreen);
            }
        });
//=======================================================
        GridPane.setColumnIndex(btnWithFriends, 2);
        GridPane.setRowIndex(btnWithFriends, 2);
        btnWithFriends.setId("withFriendButt");
        btnWithFriends.setMnemonicParsing(false);
        btnWithFriends.setPrefHeight(42.0);
        btnWithFriends.setPrefWidth(221.0);
        btnWithFriends.getStyleClass().add("anchor");
        btnWithFriends.setText(" With Friends");
        btnWithFriends.setFont(new Font("Colonna MT", 26.0));
        btnWithFriends.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               ViewSCreen.view(friiends);
            }
        });
//==================================================
        GridPane.setColumnIndex(btnOnline, 2);
        GridPane.setRowIndex(btnOnline, 3);
        btnOnline.setId("onlineButt");
        btnOnline.setMnemonicParsing(false);
        btnOnline.setPrefHeight(42.0);
        btnOnline.setPrefWidth(221.0);
        btnOnline.getStyleClass().add("anchor");
        btnOnline.setText("Play OnLine");
        btnOnline.setFont(new Font("Colonna MT", 24.0));
        btnOnline.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                 ViewSCreen.view(login);
            }
        });
//===================================================
        GridPane.setColumnIndex(imageView, 3);
        GridPane.setRowIndex(imageView, 1);
        imageView.setFitHeight(92.0);
        imageView.setFitWidth(82.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        try {
            imageView.setImage(new Image(getClass().getResource("/assets/programmer.png").toExternalForm()));
        } catch (Exception e) {
        }
//=====================================================
        GridPane.setColumnIndex(imageView0, 3);
        GridPane.setRowIndex(imageView0, 2);
        imageView0.setFitHeight(106.0);
        imageView0.setFitWidth(103.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        try {
            imageView0.setImage(new Image(getClass().getResource("/assets/icons8-user-groups-100.png").toExternalForm()));
        } catch (Exception e) {
        }
//==================================================
        GridPane.setColumnIndex(imageView1, 3);
        GridPane.setRowIndex(imageView1, 3);
        imageView1.setFitHeight(88.0);
        imageView1.setFitWidth(74.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        try {
            imageView1.setImage(new Image(getClass().getResource("/assets/online-game.png").toExternalForm()));
        } catch (Exception e) {
        }
//====================================================
        GridPane.setColumnIndex(text0, 3);
        text0.setFill(javafx.scene.paint.Color.valueOf("#04062f"));
        text0.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Let's Play..");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setWrappingWidth(149.13671875);
        text0.setFont(new Font("Forte", 23.0));

        GridPane.setColumnIndex(imageView2, 1);
        imageView2.setFitHeight(93.0);
        imageView2.setFitWidth(82.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        try {
            imageView2.setImage(new Image(getClass().getResource("/assets/arcade-game.png").toExternalForm()));
        } catch (Exception e) {
        }
//================================================
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
        getChildren().add(text);
        getChildren().add(btnWithComputer);
        getChildren().add(btnWithFriends);
        getChildren().add(btnOnline);
        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(imageView1);
        getChildren().add(text0);
        getChildren().add(imageView2);
        
        
        

    }
}
