package Controller;

import java.util.List;
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
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import model.buttonDetails;

public class DisplayRecordBase extends BorderPane {

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
    protected final Button btnNext;
    protected final ImageView imageView;
    protected final Button btnBack;
    protected final ImageView imageView0;
    protected final Image xImage;
    protected final Image oImage;
    protected int i = 0;
    protected List<buttonDetails> detailed;
    protected saveSteps recordedSteps;

    public DisplayRecordBase() {

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
        btnNext = new Button();
        imageView = new ImageView();
        btnBack = new Button();
        imageView0 = new ImageView();
        recordedSteps = new saveSteps();
        detailed = recordedSteps.loadScreen();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        getStyleClass().add("img");
        getStylesheets().add("/assets/style.css");

        xImage = new Image(getClass().getResource("/assets/gamePlay2.png").toExternalForm());

        oImage = new Image(getClass().getResource("/assets/gamePlay1.png").toExternalForm());

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
        player1Name.setText("Player1");

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
        player2Name.setText("Player2");

        player2Image.setFitHeight(42.0);
        player2Image.setFitWidth(43.0);
        player2Image.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        player2Image.setPickOnBounds(true);
        player2Image.setPreserveRatio(true);
        player2Name.setGraphic(player2Image);
        player2Name.setFont(new Font("Book Antiqua", 21.0));
        player2Name.setTextFill(javafx.scene.paint.Color.valueOf("#ffff"));

        player1Image.setImage(new Image(getClass().getResource("/assets/player1.png").toExternalForm()));
        player2Image.setImage(new Image(getClass().getResource("/assets/player2.png").toExternalForm()));

        GridPane.setColumnIndex(scoreLabel, 2);
        GridPane.setHalignment(scoreLabel, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(scoreLabel, 1);
        GridPane.setValignment(scoreLabel, javafx.geometry.VPos.CENTER);
        scoreLabel.setText("Score");
        scoreLabel.setFont(new Font("System Bold", 16.0));

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

        GridPane.setColumnIndex(player2PlayingLogo, 4);
        GridPane.setHalignment(player2PlayingLogo, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(player2PlayingLogo, 2);
        GridPane.setValignment(player2PlayingLogo, javafx.geometry.VPos.TOP);
        player2PlayingLogo.setFitHeight(61.0);
        player2PlayingLogo.setFitWidth(68.0);
        player2PlayingLogo.setPickOnBounds(true);
        player2PlayingLogo.setPreserveRatio(true);
        GridPane.setMargin(player2PlayingLogo, new Insets(10.0, 0.0, 0.0, 0.0));
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
        GridPane.setMargin(xoPane, new Insets(0.0, 0.0, 30.0, 0.0));

        GridPane.setColumnIndex(btnNext, 4);
        GridPane.setHalignment(btnNext, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(btnNext, 2);
        GridPane.setValignment(btnNext, javafx.geometry.VPos.BOTTOM);
        btnNext.setAlignment(javafx.geometry.Pos.CENTER);
        btnNext.setMnemonicParsing(false);
        btnNext.setPrefHeight(40.0);
        btnNext.setPrefWidth(50.0);
        btnNext.setText("Restart");
        btnNext.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        btnNext.setVisible(true);
        GridPane.setMargin(btnNext, new Insets(0.0, 20.0, 10.0, 0.0));

        imageView.setFitHeight(37.0);
        imageView.setFitWidth(32.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/next.png").toExternalForm()));
        btnNext.setGraphic(imageView);
        btnNext.setFont(new Font(0.1));

        GridPane.setRowIndex(btnBack, 2);
        GridPane.setValignment(btnBack, javafx.geometry.VPos.BOTTOM);
        btnBack.setAlignment(javafx.geometry.Pos.CENTER);
        btnBack.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
        btnBack.setMnemonicParsing(false);
        btnBack.setPrefHeight(40.0);
        btnBack.setPrefWidth(50.0);
        btnBack.setText("Exit");
        btnBack.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(btnBack, new Insets(0.0, 0.0, 10.0, 20.0));
        btnBack.setFont(new Font(0.1));

        imageView0.setFitHeight(37.0);
        imageView0.setFitWidth(32.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/assets/game.png").toExternalForm()));
        btnBack.setGraphic(imageView0);
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
        playingPane.getChildren().add(btnNext);
        playingPane.getChildren().add(btnBack);
        btnNext.getStyleClass().add("but");
        btnNext.getStylesheets().add("/assets/style.css");

        btnBack.getStyleClass().add("but");
        btnBack.getStylesheets().add("/assets/style.css");
        setDisable();

        btnBack.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.navigateToWelcome();
            }
        });

        btnNext.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                displayRecorded();
            }
        });

    }

    public void displayRecorded() {
        if (i < detailed.size()) {
            if (detailed.get(i).getId().equals("TopLeftButton")) {
                topLeft.setText(detailed.get(i).getContent());
                if (detailed.get(i).getContent().equals("x")) {
                    topLeftIcon.setImage(xImage);
                    topLeftIcon.setVisible(true);
                } else {
                    topLeftIcon.setImage(oImage);
                    topLeftIcon.setVisible(true);
                }
                System.out.println("0");
            } else if (detailed.get(i).getId().equals("TopCentertButton")) {
                topCenter.setText(detailed.get(i).getContent());

                if (detailed.get(i).getContent().equals("x")) {
                    topCenterIcon.setImage(xImage);
                    topCenterIcon.setVisible(true);
                } else {
                    topCenterIcon.setImage(oImage);
                    topCenterIcon.setVisible(true);
                }
                System.out.println("1");
            } else if (detailed.get(i).getId().equals("TopRightButton")) {
                topRight.setText(detailed.get(i).getContent());

                if (detailed.get(i).getContent().equals("x")) {
                    topRightIcon.setImage(xImage);
                    topRightIcon.setVisible(true);
                } else {
                    topRightIcon.setImage(oImage);
                    topRightIcon.setVisible(true);
                }
                System.out.println("2");
            } else if (detailed.get(i).getId().equals("CenterLeftButton")) {
                centerLeft.setText(detailed.get(i).getContent());
                if (detailed.get(i).getContent().equals("x")) {
                    centerLeftIcon.setImage(xImage);
                    centerLeftIcon.setVisible(true);
                } else {
                    centerLeftIcon.setImage(oImage);
                    centerLeftIcon.setVisible(true);
                }
                System.out.println("3");
            } else if (detailed.get(i).getId().equals("CentercenterButton")) {
                centerCenter.setText(detailed.get(i).getContent());
                if (detailed.get(i).getContent().equals("x")) {
                    centerCenterIcon.setImage(xImage);
                    centerCenterIcon.setVisible(true);
                } else {
                    centerCenterIcon.setImage(oImage);
                    centerCenterIcon.setVisible(true);
                }
                System.out.println("4");
            } else if (detailed.get(i).getId().equals("CenterRightButton")) {
                centerRight.setText(detailed.get(i).getContent());
                if (detailed.get(i).getContent().equals("x")) {
                    centerRightIcon.setImage(xImage);
                    centerRightIcon.setVisible(true);
                } else {
                    centerRightIcon.setImage(oImage);
                    centerRightIcon.setVisible(true);
                }
                System.out.println("5");
            } else if (detailed.get(i).getId().equals("BottomLeftButton")) {
                bottomLeft.setText(detailed.get(i).getContent());
                if (detailed.get(i).getContent().equals("x")) {
                    bottomLeftIcon.setImage(xImage);
                    bottomLeftIcon.setVisible(true);
                } else {
                    bottomLeftIcon.setImage(oImage);
                    bottomLeftIcon.setVisible(true);
                }
                System.out.println("6");
            } else if (detailed.get(i).getId().equals("BottomCenterButton")) {
                bottomCenter.setText(detailed.get(i).getContent());
                if (detailed.get(i).getContent().equals("x")) {
                    bottomCenterIcon.setImage(xImage);
                    bottomCenterIcon.setVisible(true);
                } else {
                    bottomCenterIcon.setImage(oImage);
                    bottomCenterIcon.setVisible(true);
                }
                System.out.println("7");
            } else if (detailed.get(i).getId().equals("BottomRightButton")) {
                bottomRight.setText(detailed.get(i).getContent());
                if (detailed.get(i).getContent().equals("x")) {
                    bottomRightIcon.setImage(xImage);
                    bottomRightIcon.setVisible(true);
                } else {
                    bottomRightIcon.setImage(oImage);
                    bottomRightIcon.setVisible(true);
                }
                System.out.println("8");
            }
        }
        if (i == detailed.size() - 1) {
            btnNext.setDisable(true);
        }
        i++;
    }

    public void setDisable() {
        topRight.setDisable(true);
        topCenter.setDisable(true);
        topLeft.setDisable(true);
        centerRight.setDisable(true);
        centerCenter.setDisable(true);
        centerLeft.setDisable(true);
        bottomRight.setDisable(true);
        bottomCenter.setDisable(true);
        bottomLeft.setDisable(true);
    }
}
