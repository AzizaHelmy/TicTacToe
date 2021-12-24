package PlayWithFriend;

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

public abstract class WithFriendBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final Button button;
    protected final TextField textField;
    protected final TextField textField0;
    protected final Text text;
    protected final Glow glow;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;

    public WithFriendBase() {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        button = new Button();
        textField = new TextField();
        textField0 = new TextField();
        text = new Text();
        glow = new Glow();
        imageView = new ImageView();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();

        setId("playWithFriendsScreen");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        getStyleClass().add("cardpane");
        getStylesheets().add("/PlayWithFriend/withfriend.css");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(194.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(83.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(212.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(68.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(354.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(269.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(180.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(180.0);

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

        GridPane.setColumnIndex(button, 2);
        GridPane.setRowIndex(button, 3);
        button.setId("startButt");
        button.setMnemonicParsing(false);
        button.setPrefHeight(32.0);
        button.setPrefWidth(283.0);
        button.getStylesheets().add("/PlayWithFriend/withfriend.css");
        button.setText("Start");
        button.setFont(new Font("Copperplate Gothic Bold", 19.0));

        GridPane.setColumnIndex(textField, 2);
        GridPane.setRowIndex(textField, 2);
        textField.setId("player2");
        textField.setPrefHeight(41.0);
        textField.setPrefWidth(200.0);
        textField.setPromptText("            Enter Player2's Name :");
        textField.getStylesheets().add("/PlayWithFriend/withfriend.css");

        GridPane.setColumnIndex(textField0, 2);
        GridPane.setRowIndex(textField0, 1);
        textField0.setId("player1");
        textField0.setPrefHeight(41.0);
        textField0.setPrefWidth(200.0);
        textField0.setPromptText("         Enter Player1's Name :");

        GridPane.setColumnIndex(text, 2);
        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLineSpacing(3.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("   Play With Friends..");
        text.setWrappingWidth(242.50652313232422);

        text.setEffect(glow);
        text.setFont(new Font("Berlin Sans FB Demi Bold", 23.0));

        GridPane.setColumnIndex(imageView, 3);
        imageView.setFitHeight(120.0);
        imageView.setFitWidth(155.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../assets/icons8-user-groups-100.png").toExternalForm()));

        GridPane.setColumnIndex(imageView0, 2);
        GridPane.setRowIndex(imageView0, 2);
        imageView0.setFitHeight(47.0);
        imageView0.setFitWidth(81.0);
        imageView0.setNodeOrientation(javafx.geometry.NodeOrientation.RIGHT_TO_LEFT);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../assets/icons8-football-team-48.png").toExternalForm()));

        GridPane.setColumnIndex(imageView1, 2);
        GridPane.setRowIndex(imageView1, 1);
        imageView1.setFitHeight(50.0);
        imageView1.setFitWidth(32.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("../assets/icons8-team-96.png").toExternalForm()));

        GridPane.setColumnIndex(imageView2, 1);
        GridPane.setRowIndex(imageView2, 3);
        imageView2.setFitHeight(56.0);
        imageView2.setFitWidth(108.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("../assets/icons8-game-controller-96.png").toExternalForm()));

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getColumnConstraints().add(columnConstraints2);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getChildren().add(button);
        getChildren().add(textField);
        getChildren().add(textField0);
        getChildren().add(text);
        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(imageView1);
        getChildren().add(imageView2);

    }
}
