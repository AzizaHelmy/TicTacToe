package Controller;

import Controller.LocalGame;
import Controller.Navigation;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class WithFriendBase extends GridPane {

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
    protected final Button btnstart;
    protected final TextField player2;
    protected final TextField player1;
    protected final Text text;
    protected final Glow glow;
    protected final ImageView img_friends;
    protected final ImageView img_player2;
    protected final ImageView img_player1;
    protected final ImageView img_start;
    protected final Button btnBack;
    protected final ImageView imgBack;
    protected final Glow glow0;
  public static String nameOfPlayer1;
    public static String nameOfPlayer2;

    public WithFriendBase() {

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
        btnstart = new Button();
        player2 = new TextField();
        player1 = new TextField();
        text = new Text();
        glow = new Glow();
        img_friends = new ImageView();
        img_player2 = new ImageView();
        img_player1 = new ImageView();
        img_start = new ImageView();
        btnBack = new Button();
        imgBack = new ImageView();
        glow0 = new Glow();

        setId("playWithFriendsScreen");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
       getStyleClass().add("img");
        getStylesheets().add("/assets/style.css");
//=====================================================

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(194.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(49.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(194.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(62.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(212.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(134.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(354.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(271.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(264.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(264.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(btnstart, 3);
        GridPane.setHalignment(btnstart, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(btnstart, 3);
        btnstart.setId("startButt");
        btnstart.setMnemonicParsing(false);
        btnstart.setPrefHeight(32.0);
        btnstart.setPrefWidth(283.0);
        btnstart.getStyleClass().add("border");    
        btnstart.setText("Start");
        
        btnstart.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nameOfPlayer1 = player1.getText().trim();
                nameOfPlayer2 = player2.getText().trim();
                if (nameOfPlayer1.isEmpty()) {
                    player1.setStyle("-fx-text-box-border: #FF0000; -fx-focus-color: #B22222;");
                } else if (nameOfPlayer2.isEmpty()) {
                    player2.setStyle("-fx-text-box-border: #FF0000; -fx-focus-color: #B22222;");
                } else {
                    Navigation nav = new Navigation();
                    nav.navigateToGameScreen(event, new LocalGame());
                }

            }
        });
//===============================================================
        GridPane.setColumnIndex(player2, 3);
        GridPane.setRowIndex(player2, 2);
        player2.setId("player2");
        player2.setPrefHeight(41.0);
        player2.setPrefWidth(280.0);
        player2.setPromptText("            Enter Player2's Name :");
        player2.getStylesheets().add("/view/withfriend.css");

        GridPane.setColumnIndex(player1, 3);
        GridPane.setRowIndex(player1, 1);
        player1.setId("player1");
        player1.setPrefHeight(41.0);
        player1.setPrefWidth(200.0);
        player1.setPromptText("         Enter Player1's Name :");

        GridPane.setColumnIndex(text, 3);
        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLineSpacing(3.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("   Play With Friends..");
        text.setWrappingWidth(242.50652313232422);

        text.setEffect(glow);
       text.setFont(new Font("Berlin Sans FB Demi Bold", 25.0));
        text.setFill(javafx.scene.paint.Color.valueOf("#ffff"));

        GridPane.setColumnIndex(img_friends, 4);
        img_friends.setFitHeight(120.0);
        img_friends.setFitWidth(155.0);
        img_friends.setPickOnBounds(true);
        img_friends.setPreserveRatio(true);
        try {
            img_friends.setImage(new Image(getClass().getResource("/assets/friends.png").toExternalForm()));
        } catch (Exception e) {
        }

        GridPane.setColumnIndex(img_player2, 2);
        GridPane.setHalignment(img_player2, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(img_player2, 2);
        img_player2.setFitHeight(47.0);
        img_player2.setFitWidth(43.0);
        img_player2.setNodeOrientation(javafx.geometry.NodeOrientation.RIGHT_TO_LEFT);
        img_player2.setPickOnBounds(true);
        img_player2.setPreserveRatio(true);
        try {
            img_player2.setImage(new Image(getClass().getResource("/assets/icons8-team-96.png").toExternalForm()));
        } catch (Exception e) {
        }
        GridPane.setColumnIndex(img_player1, 2);
        GridPane.setHalignment(img_player1, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(img_player1, 1);
        img_player1.setFitHeight(50.0);
        img_player1.setFitWidth(43.0);
        img_player1.setPickOnBounds(true);
        img_player1.setPreserveRatio(true);
      try {
            img_player1.setImage(new Image(getClass().getResource("/assets/icons8-team-96.png").toExternalForm()));
        } catch (Exception e) {
        }
        GridPane.setColumnIndex(img_start, 4);
        GridPane.setRowIndex(img_start, 3);
        img_start.setFitHeight(56.0);
        img_start.setFitWidth(108.0);
        img_start.setPickOnBounds(true);
        img_start.setPreserveRatio(true);
          try {
            img_start.setImage(new Image(getClass().getResource("/assets/icons8-game-controller-96.png").toExternalForm()));
        } catch (Exception e) {
        }
//======================================================
        GridPane.setColumnIndex(btnBack, 1);
        GridPane.setRowIndex(btnBack, 4);
        GridPane.setValignment(btnBack, javafx.geometry.VPos.TOP);
        btnBack.setAlignment(javafx.geometry.Pos.CENTER);
        btnBack.setMnemonicParsing(false);
        btnBack.setPrefHeight(37.0);
        btnBack.setPrefWidth(98.0);
       
        imgBack.setFitHeight(36.0);
        imgBack.setFitWidth(40.0);
        imgBack.setPickOnBounds(true);
        imgBack.setPreserveRatio(true);
         try {
            imgBack.setImage(new Image(getClass().getResource("/assets/previous.png").toExternalForm()));
        } catch (Exception e) {
        }
        btnBack.setGraphic(imgBack);

        btnBack.setEffect(glow0);
    btnBack.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.navigateToWelcome(event);
            }
        });
//===================================================
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
        getChildren().add(btnstart);
        getChildren().add(player2);
        getChildren().add(player1);
        getChildren().add(text);
        getChildren().add(img_friends);
        getChildren().add(img_player2);
        getChildren().add(img_player1);
        getChildren().add(img_start);
        getChildren().add(btnBack);

        //========================================================
        btnBack.getStyleClass().add("backg");
        btnBack.getStylesheets().add("/assets/style.css");
        btnstart.getStylesheets().add("/PlayWithFriend/withfriend.css");
        btnstart.setFont(new Font("Copperplate Gothic Bold", 19.0));
    }
}
