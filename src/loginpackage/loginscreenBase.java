package loginpackage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import tictactoe.Navigation;

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
                Navigation nav = new Navigation();
                nav.navigateToRegisterScreen(event);
            }
        });
        btnSigninlog.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.navigateToOnlineScreen(event);
            }
        });
        button.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.navigateToWelcome(event);
            }
        });
    }
}
