package Controller;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import model.Login;
import model.Player;

public class loginscreenBase extends AnchorPane {

    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final Text text;
    protected final ImageView imageView;
    protected final TextField usernamelog_field;
    protected final TextField passlog_field;
    protected final Button btnSigninlog;
    protected final ImageView imageView0;
    protected final Button btnSignuplog;
    protected final ImageView imageView1;
    protected final Button button;
    protected final ImageView btnBacklog;
    protected Navigation nav;

    private ObjectInputStream ObjectinputStream;
    private ObjectOutputStream ObjectoutputStream;

    public loginscreenBase() {

        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        text = new Text();
        imageView = new ImageView();
        usernamelog_field = new TextField();
        passlog_field = new TextField();
        btnSigninlog = new Button();
        imageView0 = new ImageView();
        btnSignuplog = new Button();
        imageView1 = new ImageView();
        button = new Button();
        btnBacklog = new ImageView();
        nav = new Navigation();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(700.0);

        anchorPane.setPrefHeight(174.0);
        anchorPane.setPrefWidth(700.0);
        anchorPane.getStyleClass().add("anchor");
        anchorPane.getStylesheets().add("/loginpackage/login.css");

        anchorPane0.setLayoutX(70.0);
        anchorPane0.setLayoutY(93.0);
        anchorPane0.setPrefHeight(365.0);
        anchorPane0.setPrefWidth(554.0);
        anchorPane0.getStyleClass().add("cardpane");
        anchorPane0.getStylesheets().add("/loginpackage/login.css");

        text.setLayoutX(248.0);
        text.setLayoutY(27.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tic Tac Toe");
        text.setFont(new Font(18.0));

        imageView.setFitHeight(100.0);
        imageView.setFitWidth(100.0);
        imageView.setLayoutX(242.0);
        imageView.setLayoutY(39.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/icons8-xo-xo-64.png").toExternalForm()));

        usernamelog_field.setLayoutX(192.0);
        usernamelog_field.setLayoutY(158.0);
        usernamelog_field.setPrefHeight(25.0);
        usernamelog_field.setPrefWidth(200.0);
        usernamelog_field.setPromptText("Enter your name");

        passlog_field.setLayoutX(193.0);
        passlog_field.setLayoutY(208.0);
        passlog_field.setPrefHeight(25.0);
        passlog_field.setPrefWidth(200.0);
        passlog_field.setPromptText("Enter paaword");

        btnSigninlog.setLayoutX(105.0);
        btnSigninlog.setLayoutY(267.0);
        btnSigninlog.setMnemonicParsing(false);
        btnSigninlog.getStyleClass().add("cardpane");
        btnSigninlog.getStylesheets().add("/loginpackage/login.css");
        btnSigninlog.setText("Sign in");

        imageView0.setFitHeight(20.0);
        imageView0.setFitWidth(20.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/assets/icons8-signup-64.png").toExternalForm()));
        btnSigninlog.setGraphic(imageView0);

        btnSignuplog.setLayoutX(393.0);
        btnSignuplog.setLayoutY(271.0);
        btnSignuplog.setMnemonicParsing(false);
        btnSignuplog.getStyleClass().add("cardpane");
        btnSignuplog.getStylesheets().add("/loginpackage/login.css");
        btnSignuplog.setText("Sign up");

        imageView1.setFitHeight(20.0);
        imageView1.setFitWidth(20.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/assets/icons8-sign-up-64 (3).png").toExternalForm()));
        btnSignuplog.setGraphic(imageView1);

        button.setLayoutX(266.0);
        button.setLayoutY(326.0);
        button.setMnemonicParsing(false);
        button.getStyleClass().add("cardpane");
        button.getStylesheets().add("/loginpackage/login.css");

        btnBacklog.setFitHeight(20.0);
        btnBacklog.setFitWidth(20.0);
        btnBacklog.setPickOnBounds(true);
        btnBacklog.setPreserveRatio(true);
        btnBacklog.setImage(new Image(getClass().getResource("/assets/icons8-back-50.png").toExternalForm()));
        button.setGraphic(btnBacklog);

        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(text);
        anchorPane0.getChildren().add(imageView);
        anchorPane0.getChildren().add(usernamelog_field);
        anchorPane0.getChildren().add(passlog_field);
        anchorPane0.getChildren().add(btnSigninlog);
        anchorPane0.getChildren().add(btnSignuplog);
        anchorPane0.getChildren().add(button);
        getChildren().add(anchorPane0);
        btnSignuplog.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigateToRegisterScreen();
            }
        });
//===================================================       
        btnSigninlog.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    if (usernamelog_field.getText().trim().isEmpty() || passlog_field.getText().trim().isEmpty()) {
                        usernamelog_field.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                        passlog_field.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                    } else {
                        System.out.println("1");
                        ObjectoutputStream = ClientSocket.getObjectOutputStreamInstance();
                        Login login = new Login(usernamelog_field.getText().trim(), passlog_field.getText().trim());
                        System.out.println(login.getUserName().trim() + " , " + login.getPassward().trim());
                        ObjectoutputStream.writeObject(login);
                        ObjectoutputStream.flush();

                        ObjectinputStream = ClientSocket.getObjectInputStreamInstance();
                        Object obj = ObjectinputStream.readObject();

                        if (obj instanceof String) {
                            String msg = (String) obj;
                            System.out.println(msg);
                            usernamelog_field.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                            passlog_field.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
                        } else if (obj instanceof Player) {
                            Player p = (Player) obj;
                            System.out.println(p.getIsOnline() + " , " + p.getIsRequest());
                            nav.navigateToOnlineScreen(p);
                        }
                    }
                } catch (SocketException s) {

                } catch (EOFException e) {

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(loginscreenBase.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(loginscreenBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        );
//=======================================================       
        button.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    ClientSocket.closeSocket();
                    nav.navigateToWelcome();
                } catch (IOException ex) {
                    Logger.getLogger(loginscreenBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        );
    }
}
