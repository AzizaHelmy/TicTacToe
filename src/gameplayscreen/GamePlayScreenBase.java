package gameplayscreen;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public abstract class GamePlayScreenBase extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Label player1Name;
    protected final ImageView imageView;
    protected final Label player2Name;
    protected final ImageView imageView0;
    protected final Label label;
    protected final Label label0;
    protected final Label player1Score;
    protected final Label player2Score;
    protected final ImageView player1Logo;
    protected final ImageView player2Logo;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints4;
    protected final ColumnConstraints columnConstraints5;
    protected final ColumnConstraints columnConstraints6;
    protected final ColumnConstraints columnConstraints7;
    protected final ColumnConstraints columnConstraints8;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final AnchorPane anchorPane;
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
    protected final ImageView imageView1;
    protected final Button btnExit;
    protected final ImageView imageView2;

    public GamePlayScreenBase() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        player1Name = new Label();
        imageView = new ImageView();
        player2Name = new Label();
        imageView0 = new ImageView();
        label = new Label();
        label0 = new Label();
        player1Score = new Label();
        player2Score = new Label();
        player1Logo = new ImageView();
        player2Logo = new ImageView();
        gridPane0 = new GridPane();
        columnConstraints4 = new ColumnConstraints();
        columnConstraints5 = new ColumnConstraints();
        columnConstraints6 = new ColumnConstraints();
        columnConstraints7 = new ColumnConstraints();
        columnConstraints8 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        anchorPane = new AnchorPane();
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
        imageView1 = new ImageView();
        btnExit = new Button();
        imageView2 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);

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
        player1Name.setText("Player1");

        imageView.setFitHeight(42.0);
        imageView.setFitWidth(43.0);
        imageView.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../assets/player1.png").toExternalForm()));
        player1Name.setGraphic(imageView);
        player1Name.setFont(new Font(18.0));

        GridPane.setColumnIndex(player2Name, 4);
        GridPane.setHalignment(player2Name, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(player2Name, 1);
        GridPane.setValignment(player2Name, javafx.geometry.VPos.CENTER);
        player2Name.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
        player2Name.setText("Player2");

        imageView0.setFitHeight(42.0);
        imageView0.setFitWidth(43.0);
        imageView0.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../assets/player2.png").toExternalForm()));
        player2Name.setGraphic(imageView0);
        player2Name.setFont(new Font(18.0));

        GridPane.setColumnIndex(label, 2);
        GridPane.setHalignment(label, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(label, 1);
        GridPane.setValignment(label, javafx.geometry.VPos.CENTER);
        label.setText("Score");
        label.setFont(new Font("System Bold", 16.0));

        GridPane.setColumnIndex(label0, 2);
        GridPane.setHalignment(label0, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(label0, 2);
        GridPane.setValignment(label0, javafx.geometry.VPos.CENTER);
        label0.setText(":");
        label0.setFont(new Font(16.0));

        GridPane.setColumnIndex(player1Score, 1);
        GridPane.setHalignment(player1Score, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(player1Score, 2);
        GridPane.setValignment(player1Score, javafx.geometry.VPos.CENTER);
        player1Score.setText("0");
        player1Score.setTextFill(javafx.scene.paint.Color.valueOf("#1800f5"));
        player1Score.setFont(new Font(16.0));

        GridPane.setColumnIndex(player2Score, 3);
        GridPane.setRowIndex(player2Score, 2);
        player2Score.setText("0");
        player2Score.setTextFill(javafx.scene.paint.Color.RED);
        player2Score.setFont(new Font(16.0));

        GridPane.setHalignment(player1Logo, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(player1Logo, 2);
        GridPane.setValignment(player1Logo, javafx.geometry.VPos.TOP);
        player1Logo.setFitHeight(61.0);
        player1Logo.setFitWidth(68.0);
        player1Logo.setPickOnBounds(true);
        player1Logo.setPreserveRatio(true);
        GridPane.setMargin(player1Logo, new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(player2Logo, 4);
        GridPane.setHalignment(player2Logo, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(player2Logo, 2);
        GridPane.setValignment(player2Logo, javafx.geometry.VPos.TOP);
        player2Logo.setFitHeight(61.0);
        player2Logo.setFitWidth(68.0);
        player2Logo.setPickOnBounds(true);
        player2Logo.setPreserveRatio(true);
        GridPane.setMargin(player2Logo, new Insets(10.0, 0.0, 0.0, 0.0));
        setTop(gridPane);

        BorderPane.setAlignment(gridPane0, javafx.geometry.Pos.CENTER);

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

        GridPane.setColumnIndex(anchorPane, 2);
        GridPane.setHalignment(anchorPane, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(anchorPane, 1);
        GridPane.setValignment(anchorPane, javafx.geometry.VPos.CENTER);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        topRight.setAlignment(javafx.geometry.Pos.CENTER);
        topRight.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        topRight.setLayoutX(171.0);
        topRight.setLayoutY(1.0);
        topRight.setMnemonicParsing(false);
        topRight.setPrefHeight(71.0);
        topRight.setPrefWidth(79.0);
        topRight.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        topRight.setTextFill(javafx.scene.paint.Color.WHITE);

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

        bottomLeftIcon.setDisable(true);
        bottomLeftIcon.setFitHeight(60.0);
        bottomLeftIcon.setFitWidth(60.0);
        bottomLeftIcon.setPickOnBounds(true);
        bottomLeftIcon.setPreserveRatio(true);
        bottomLeftIcon.setVisible(false);
        bottomLeft.setGraphic(bottomLeftIcon);
        GridPane.setMargin(anchorPane, new Insets(0.0, 0.0, 30.0, 0.0));

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

        imageView1.setFitHeight(37.0);
        imageView1.setFitWidth(32.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("../assets/restart.png").toExternalForm()));
        btnRestart.setGraphic(imageView1);
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

        imageView2.setFitHeight(37.0);
        imageView2.setFitWidth(32.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("../assets/exit.png").toExternalForm()));
        btnExit.setGraphic(imageView2);
        setCenter(gridPane0);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getColumnConstraints().add(columnConstraints3);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(player1Name);
        gridPane.getChildren().add(player2Name);
        gridPane.getChildren().add(label);
        gridPane.getChildren().add(label0);
        gridPane.getChildren().add(player1Score);
        gridPane.getChildren().add(player2Score);
        gridPane.getChildren().add(player1Logo);
        gridPane.getChildren().add(player2Logo);
        gridPane0.getColumnConstraints().add(columnConstraints4);
        gridPane0.getColumnConstraints().add(columnConstraints5);
        gridPane0.getColumnConstraints().add(columnConstraints6);
        gridPane0.getColumnConstraints().add(columnConstraints7);
        gridPane0.getColumnConstraints().add(columnConstraints8);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints4);
        anchorPane.getChildren().add(topRight);
        anchorPane.getChildren().add(centerRight);
        anchorPane.getChildren().add(bottomRight);
        anchorPane.getChildren().add(topCenter);
        anchorPane.getChildren().add(centerCenter);
        anchorPane.getChildren().add(bottomCenter);
        anchorPane.getChildren().add(topLeft);
        anchorPane.getChildren().add(centerLeft);
        anchorPane.getChildren().add(bottomLeft);
        gridPane0.getChildren().add(anchorPane);
        gridPane0.getChildren().add(btnRestart);
        gridPane0.getChildren().add(btnExit);

    }
}
