package loginpackage;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;

public abstract class loginscreenBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final Text text;
    protected final ImageView imageView;
    protected final TextField usernamelogin_field;
    protected final TextField passwordlogin_field;
    protected final Button loginsignin_btn;
    protected final ImageView imageView0;
    protected final Button loginsignup_btn;
    protected final ImageView imageView1;
    protected final ImageView imageView2;

    public loginscreenBase() {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        text = new Text();
        imageView = new ImageView();
        usernamelogin_field = new TextField();
        passwordlogin_field = new TextField();
        loginsignin_btn = new Button();
        imageView0 = new ImageView();
        loginsignup_btn = new Button();
        imageView1 = new ImageView();
        imageView2 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(700.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(0.0);
        rowConstraints.setPrefHeight(2.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(60.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(10.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(10.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(text, 1);
        GridPane.setHalignment(text, javafx.geometry.HPos.CENTER);
        text.setFill(javafx.scene.paint.Color.valueOf("#2d0ff2"));
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tic Tac Toe");

        GridPane.setColumnIndex(imageView, 1);
        GridPane.setHalignment(imageView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(imageView, 1);
        imageView.setFitHeight(100.0);
        imageView.setFitWidth(100.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../assets/xo.jpg").toExternalForm()));

        GridPane.setColumnIndex(usernamelogin_field, 1);
        GridPane.setRowIndex(usernamelogin_field, 2);
        usernamelogin_field.setPromptText("Enter your name");

        GridPane.setColumnIndex(passwordlogin_field, 1);
        GridPane.setRowIndex(passwordlogin_field, 3);
        passwordlogin_field.setPromptText("Enter password");

        GridPane.setHalignment(loginsignin_btn, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(loginsignin_btn, 4);
        loginsignin_btn.setMnemonicParsing(false);
        loginsignin_btn.getStyleClass().add("cardpane");
        loginsignin_btn.getStylesheets().add("/loginpackage/login.css");
        loginsignin_btn.setText("Sign in");

        imageView0.setFitHeight(20.0);
        imageView0.setFitWidth(20.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../assets/icons8-sign-in-64.png").toExternalForm()));
        loginsignin_btn.setGraphic(imageView0);

        GridPane.setColumnIndex(loginsignup_btn, 2);
        GridPane.setHalignment(loginsignup_btn, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(loginsignup_btn, 4);
        loginsignup_btn.setMnemonicParsing(false);
        loginsignup_btn.getStyleClass().add("cardpane");
        loginsignup_btn.getStylesheets().add("/loginpackage/login.css");
        loginsignup_btn.setText("Sign up");

        imageView1.setFitHeight(20.0);
        imageView1.setFitWidth(20.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("../assets/icons8-sign-up-64.png").toExternalForm()));
        loginsignup_btn.setGraphic(imageView1);

        GridPane.setColumnIndex(imageView2, 1);
        GridPane.setRowIndex(imageView2, 2);
        imageView2.setFitHeight(20.0);
        imageView2.setFitWidth(20.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getChildren().add(text);
        getChildren().add(imageView);
        getChildren().add(usernamelogin_field);
        getChildren().add(passwordlogin_field);
        getChildren().add(loginsignin_btn);
        getChildren().add(loginsignup_btn);
        getChildren().add(imageView2);

    }
}
