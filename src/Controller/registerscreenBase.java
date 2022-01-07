package Controller;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import model.Player;
import model.Register;

public class registerscreenBase extends GridPane {

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
    protected final TextField regusername_field;
    protected final PasswordField registerpass_field;
    protected final Button btn_signupreg;
    protected final ImageView imageView;
    protected final Button button;
    protected final Button button0;
    protected final ImageView btnbackreg;
    protected Navigation nav;
    private ObjectInputStream ObjectinputStream;
    private ObjectOutputStream ObjectoutputStream;
    private PopUp pop;

    public registerscreenBase() {

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
        regusername_field = new TextField();
        registerpass_field = new PasswordField();
        btn_signupreg = new Button();
        imageView = new ImageView();
        button = new Button();
        button0 = new Button();
        btnbackreg = new ImageView();
        nav = new Navigation();
        pop = new PopUp();
        
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

        rowConstraints.setMinHeight(0.0);
        rowConstraints.setPrefHeight(2.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(10.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(10.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(5.0);
        rowConstraints3.setPrefHeight(5.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(text, 1);
        GridPane.setHalignment(text, javafx.geometry.HPos.CENTER);

        text.setFill(javafx.scene.paint.Color.valueOf("#04011e"));
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tic Tac Toe");

        GridPane.setColumnIndex(regusername_field, 1);
        GridPane.setRowIndex(regusername_field, 1);
        regusername_field.setPromptText("Enter your name");

        GridPane.setColumnIndex(registerpass_field, 1);
        GridPane.setRowIndex(registerpass_field, 2);
        registerpass_field.setPromptText("Enter password");

        GridPane.setColumnIndex(btn_signupreg, 1);
        GridPane.setHalignment(btn_signupreg, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(btn_signupreg, 3);
        btn_signupreg.setMnemonicParsing(false);
        btn_signupreg.setPrefHeight(42.0);
        btn_signupreg.setPrefWidth(97.0);
        btn_signupreg.getStyleClass().add("cardpane");
        btn_signupreg.getStylesheets().add("/registerpackage/login.css");
        btn_signupreg.setText("Sign up");
        btn_signupreg.setTextFill(javafx.scene.paint.Color.valueOf("#fffafa"));

        imageView.setFitHeight(20.0);
        imageView.setFitWidth(20.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/icons8-sign-up-64 (3).png").toExternalForm()));
        btn_signupreg.setGraphic(imageView);

        GridPane.setColumnIndex(button, 2);
        GridPane.setRowIndex(button, 4);
        button.setMnemonicParsing(false);
        button.getStyleClass().add("cardpane");
        button.getStylesheets().add("/registerpackage/login.css");
        button.setText("Already have an account?");

        GridPane.setHalignment(button0, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(button0, 4);
        button0.setMnemonicParsing(false);
        button0.getStyleClass().add("cardpane");
        button0.getStylesheets().add("/registerpackage/login.css");

        btnbackreg.setFitHeight(20.0);
        btnbackreg.setFitWidth(20.0);
        btnbackreg.setPickOnBounds(true);
        btnbackreg.setPreserveRatio(true);
        btnbackreg.setImage(new Image(getClass().getResource("/assets/icons8-back-50.png").toExternalForm()));
        button0.setGraphic(btnbackreg);
        button0.setVisible(false);

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
        getChildren().add(regusername_field);
        getChildren().add(registerpass_field);
        getChildren().add(btn_signupreg);
        getChildren().add(button);
        getChildren().add(button0);

//============================================================       
        btn_signupreg.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Register register = new Register(regusername_field.getText().trim(), registerpass_field.getText().trim());
                try {
                    if (!regusername_field.getText().trim().isEmpty()
                            && !registerpass_field.getText().trim().isEmpty()) {
                        ObjectoutputStream = ClientSocket.getObjectOutputStreamInstance();
                        System.out.println(ObjectoutputStream);
                        ObjectoutputStream.writeObject(register);
                        ObjectoutputStream.flush();

                        ObjectinputStream = ClientSocket.getObjectInputStreamInstance();
                        Object obj = ObjectinputStream.readObject();
                        if (obj instanceof String) {
                            regusername_field.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                            registerpass_field.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                            System.out.println("error");
                        } else if (obj instanceof Player) {
                            Player p = (Player) obj;
                            nav.navigateToOnlineScreen(p);
                        }

                    } else {
                        regusername_field.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                        registerpass_field.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                    }
                } catch (SocketException s) {
                    pop.showErrorInServer();
                } catch (EOFException e) {
                } catch (IOException ex) {
                    Logger.getLogger(registerscreenBase.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(registerscreenBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
//===========================================================        
        button.addEventHandler(ActionEvent.ACTION,
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                nav.navigateToLoginScreen();
            }
        }
        );
    }
}
