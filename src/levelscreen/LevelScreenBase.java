package levelscreen;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public  class LevelScreenBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final Button btnMedium;
    protected final Button btnDifficullt;
    protected final Button btnEasy;
    protected final Label label;

    public LevelScreenBase() {

        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        btnMedium = new Button();
        btnDifficullt = new Button();
        btnEasy = new Button();
        label = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

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

        GridPane.setHalignment(btnMedium, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(btnMedium, 3);
        GridPane.setValignment(btnMedium, javafx.geometry.VPos.CENTER);
        btnMedium.setMnemonicParsing(false);
        btnMedium.setPrefHeight(31.0);
        btnMedium.setPrefWidth(129.0);
        btnMedium.setText("Medium");

        GridPane.setHalignment(btnDifficullt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(btnDifficullt, 4);
        GridPane.setValignment(btnDifficullt, javafx.geometry.VPos.CENTER);
        btnDifficullt.setMnemonicParsing(false);
        btnDifficullt.setPrefHeight(31.0);
        btnDifficullt.setPrefWidth(129.0);
        btnDifficullt.setText("Difficult");

        GridPane.setHalignment(btnEasy, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(btnEasy, 2);
        GridPane.setValignment(btnEasy, javafx.geometry.VPos.CENTER);
        btnEasy.setMnemonicParsing(false);
        btnEasy.setPrefHeight(31.0);
        btnEasy.setPrefWidth(129.0);
        btnEasy.setText("Esay");

        GridPane.setHalignment(label, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(label, 1);
        GridPane.setValignment(label, javafx.geometry.VPos.CENTER);
        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setText("SELECT LEVEL");

        getColumnConstraints().add(columnConstraints);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getChildren().add(btnMedium);
        getChildren().add(btnDifficullt);
        getChildren().add(btnEasy);
        getChildren().add(label);

    }
}
