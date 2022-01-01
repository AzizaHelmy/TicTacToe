package Controller;

import Controller.ComputerEasyLevel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public class LevelScreenBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final Button btnDifficullt;
    protected final Button btnEasy;
    protected final Label textSelsctLevel;
    protected final Button btnBack;
    protected final ImageView imgBack;
    protected final Glow glow;

    public LevelScreenBase() {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        btnDifficullt = new Button();
        btnEasy = new Button();
        textSelsctLevel = new Label();
        btnBack = new Button();
        imgBack = new ImageView();
        glow = new Glow();
        
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

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

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(btnDifficullt, 1);
        GridPane.setHalignment(btnDifficullt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(btnDifficullt, 3);
        GridPane.setValignment(btnDifficullt, javafx.geometry.VPos.CENTER);
        btnDifficullt.setMnemonicParsing(false);
        btnDifficullt.setPrefHeight(31.0);
        btnDifficullt.setPrefWidth(129.0);
        btnDifficullt.setText("Difficult");
        
        btnDifficullt.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.navigateToGameScreen(event, new ComputerEasyLevel());
            }
        });
//====================================
        GridPane.setColumnIndex(btnEasy, 1);
        GridPane.setHalignment(btnEasy, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(btnEasy, 2);
        GridPane.setValignment(btnEasy, javafx.geometry.VPos.CENTER);
        btnEasy.setMnemonicParsing(false);
        btnEasy.setPrefHeight(31.0);
        btnEasy.setPrefWidth(129.0);
        btnEasy.setText("Esay");

        btnEasy.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.navigateToGameScreen(event, new ComputerEasyLevel());
            }
        });
        //==========================================
        GridPane.setColumnIndex(textSelsctLevel, 1);
        GridPane.setHalignment(textSelsctLevel, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(textSelsctLevel, 1);
        GridPane.setValignment(textSelsctLevel, javafx.geometry.VPos.CENTER);
        textSelsctLevel.setAlignment(javafx.geometry.Pos.CENTER);
        textSelsctLevel.setText("SELECT LEVEL");
        textSelsctLevel.setFont(new Font("Bodoni MT", 20.0));

        GridPane.setHalignment(btnBack, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(btnBack, 4);
        GridPane.setValignment(btnBack, javafx.geometry.VPos.CENTER);
        btnBack.setAlignment(javafx.geometry.Pos.CENTER);
        btnBack.setMnemonicParsing(false);
        btnBack.setPrefHeight(45.0);
        btnBack.setPrefWidth(63.0);
        btnBack.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.navigateToWelcome(event);
            }
        });
        //==========================================
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

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getChildren().add(btnDifficullt);
        getChildren().add(btnEasy);
        getChildren().add(textSelsctLevel);
        getChildren().add(btnBack);

    }
}
