package Controller;

import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ServerRegistrationBase extends FlowPane {

    protected final BorderPane borderPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final ImageView imgServer;
    protected final Rectangle recTitle;
    protected final Text text;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final ImageView imgInvalid;
    protected final Button btnConnect;
    protected final static TextField txtFieldIP = new TextField();
    protected final Text txtInvalid;
    protected final Rectangle rectangle;
    protected final Label label;
    protected final Button btnBack;
    protected Socket socket;

    public ServerRegistrationBase() {

        borderPane = new BorderPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        imgServer = new ImageView();
        recTitle = new Rectangle(150, 30, 100, 65);
        text = new Text();
        gridPane0 = new GridPane();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        imgInvalid = new ImageView();
        btnConnect = new Button();
        //txtFieldIP = new TextField();
        txtInvalid = new Text();
        rectangle = new Rectangle(150, 30, 100, 65);
        label = new Label();
        btnBack = new Button();
        
        setAlignment(javafx.geometry.Pos.CENTER);

        borderPane.setMaxHeight(USE_PREF_SIZE);
        borderPane.setMaxWidth(USE_PREF_SIZE);
        borderPane.setMinHeight(USE_PREF_SIZE);
        borderPane.setMinWidth(USE_PREF_SIZE);
        borderPane.setPrefHeight(400.0);
        borderPane.setPrefWidth(600.0);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setPrefHeight(230.0);
        gridPane.setPrefWidth(600.0);

        columnConstraints.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        rowConstraints.setMaxHeight(33.0);
        rowConstraints.setMinHeight(0.0);
        rowConstraints.setPrefHeight(12.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(62.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(45.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(140.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(126.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(imgServer, 2);
        imgServer.setFitHeight(160.0);
        imgServer.setFitWidth(136.0);
        imgServer.setPickOnBounds(true);
        imgServer.setPreserveRatio(true);
        imgServer.setImage(new Image(getClass().getResource("/assets/server.png").toExternalForm()));
        Stop[] stops = new Stop[]{
            new Stop(0, Color.GRAY),
            new Stop(1, Color.WHITE)
        };
        LinearGradient gradient
                = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
        GridPane.setRowIndex(recTitle, 1);
        recTitle.setArcHeight(5.0);
        recTitle.setArcWidth(5.0);
        recTitle.setFill(javafx.scene.paint.Color.valueOf("#d0d0d0"));
        recTitle.setHeight(45.0);
        recTitle.setStroke(javafx.scene.paint.Color.valueOf("#836565"));
        recTitle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        recTitle.setWidth(277.0);
        recTitle.setFill(gradient);

        GridPane.setRowIndex(text, 1);
        text.setStroke(javafx.scene.paint.Color.valueOf("#ffffff"));
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("SERVER REGISTRATION");
        text.setWrappingWidth(179.18701171875);
        text.setFont(new Font("Arial Bold", 15.0));
        borderPane.setTop(gridPane);

        BorderPane.setAlignment(gridPane0, javafx.geometry.Pos.CENTER);
        gridPane0.setPrefHeight(108.0);
        gridPane0.setPrefWidth(600.0);

        columnConstraints0.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(211.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(112.0);

        columnConstraints1.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints1.setMaxWidth(211.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(112.0);

        columnConstraints2.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints2.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints2.setMaxWidth(237.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(237.0);

        columnConstraints3.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(335.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(130.0);

        columnConstraints4.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMaxWidth(174.0);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(29.0);

        rowConstraints2.setMaxHeight(145.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(87.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(96.0);
        rowConstraints3.setMinHeight(0.0);
        rowConstraints3.setPrefHeight(58.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMaxHeight(68.0);
        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(68.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(imgInvalid, 1);
        imgInvalid.setFitHeight(58.0);
        imgInvalid.setFitWidth(79.0);
        imgInvalid.setPickOnBounds(true);
        imgInvalid.setPreserveRatio(true);
        imgInvalid.setVisible(false);
        imgInvalid.setImage(new Image(getClass().getResource("/assets/frogFace.png").toExternalForm()));

        GridPane.setColumnIndex(btnConnect, 3);
        GridPane.setRowIndex(btnConnect, 1);
        btnConnect.setDefaultButton(true);
        btnConnect.setMnemonicParsing(false);
        btnConnect.setText("Connect");
        btnConnect.setFont(new Font("System Bold", 16.0));

        GridPane.setColumnIndex(txtFieldIP, 2);
        GridPane.setRowIndex(txtFieldIP, 1);
        txtFieldIP.setPromptText("@EXAMPLE 192.168.1.1");

        GridPane.setColumnIndex(txtInvalid, 2);
        GridPane.setHalignment(txtInvalid, javafx.geometry.HPos.CENTER);
        GridPane.setHgrow(txtInvalid, javafx.scene.layout.Priority.ALWAYS);
        GridPane.setValignment(txtInvalid, javafx.geometry.VPos.CENTER);
        GridPane.setVgrow(txtInvalid, javafx.scene.layout.Priority.ALWAYS);
        txtInvalid.setFill(javafx.scene.paint.Color.RED);
        txtInvalid.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txtInvalid.setStrokeWidth(0.0);
        txtInvalid.setText("INVALID SERVER IP");
        txtInvalid.setVisible(false);
        txtInvalid.setFont(new Font("System Bold", 15.0));

        GridPane.setColumnIndex(rectangle, 1);
        GridPane.setRowIndex(rectangle, 1);
        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(gradient);
        rectangle.setHeight(37.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(87.0);

        GridPane.setColumnIndex(label, 1);
        GridPane.setHalignment(label, javafx.geometry.HPos.CENTER);
        GridPane.setHgrow(label, javafx.scene.layout.Priority.ALWAYS);
        GridPane.setRowIndex(label, 1);
        GridPane.setValignment(label, javafx.geometry.VPos.CENTER);
        GridPane.setVgrow(label, javafx.scene.layout.Priority.ALWAYS);
        label.setText("SERVER IP");
        label.setFont(new Font("System Bold", 14.0));

        GridPane.setRowIndex(btnBack, 2);
        btnBack.setDefaultButton(true);
        btnBack.setMnemonicParsing(false);
        btnBack.setText("BACK");
        btnBack.setFont(new Font("System Bold", 15.0));
        borderPane.setCenter(gridPane0);
//==========================================================
        btnConnect.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isValidIPAddress(txtFieldIP.getText())) {
                    socket = ClientSocket.getInstance(txtFieldIP.getText());

                    System.out.println("Connected");
                    Navigation nav = new Navigation();
                    nav.navigateToLoginScreen(event);
                } else {
                    imgInvalid.setVisible(true);
                    txtInvalid.setVisible(true);
                }
            }

        });
//=========================================================
        btnBack.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.navigateToWelcome(event);
            }
        });

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(imgServer);
        gridPane.getChildren().add(recTitle);
        gridPane.getChildren().add(text);
        gridPane0.getColumnConstraints().add(columnConstraints0);
        gridPane0.getColumnConstraints().add(columnConstraints1);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getColumnConstraints().add(columnConstraints3);
        gridPane0.getColumnConstraints().add(columnConstraints4);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints4);
        gridPane0.getChildren().add(imgInvalid);
        gridPane0.getChildren().add(btnConnect);
        gridPane0.getChildren().add(txtFieldIP);
        gridPane0.getChildren().add(txtInvalid);
        gridPane0.getChildren().add(rectangle);
        gridPane0.getChildren().add(label);
        gridPane0.getChildren().add(btnBack);
        getChildren().add(borderPane);

    }

    public static boolean isValidIPAddress(String ip) {

        /*\d represents digits in regular expressions, same as [0-9]
        \\d{1, 2} catches any one or two-digit number
        (0|1)\\d{2} catches any three-digit number starting with 0 or 1.
        2[0-4]\\d catches numbers between 200 and 249.
`       25[0-5] catches numbers between 250 and 255.*/
        String zeroTo255
                = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";

        String regex
                = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;

        Pattern p = Pattern.compile(regex);

        if (ip == null) {
            return false;
        }

        Matcher m = p.matcher(ip);

        return m.matches();
    }

}
