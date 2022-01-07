package Controller;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.net.SocketException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import model.LogOut;
import model.Player;

public class PopUp {

    protected Navigation nav = new Navigation();
    protected LogOut logOut;
    protected ObjectInputStream objectInputStream;
    protected ObjectOutputStream objectOutputStream;

    /////////   Server is under maintenance 
    public void showErrorInServer() {
        Dialog dialog = new Dialog();
        dialog.setTitle("Error In Server");
        ButtonType ok = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
        dialog.setContentText("Server is under maintenance" + "\n" + "Please press OK to go to welcome screen");
        dialog.getDialogPane().getButtonTypes().add(ok);
        Button okButton = (Button) dialog.getDialogPane().lookupButton(ok);
        dialog.show();

        Window window = dialog.getDialogPane().getScene().getWindow();
        window.setOnCloseRequest(event -> event.consume());

        okButton.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nav.navigateToWelcome();
                dialog.hide();
                //  dialog.close();
            }
        }
        );
    }

    ///      waitForConnecting         waitForRsponse
    public void waitForConnecting() {
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle("Connect to server");
        alert.setContentText("waiting for connection");
        alert.setResult(ButtonType.CANCEL);

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
                if (alert.isShowing()) {
                    Platform.runLater(() -> alert.close());
                }
            } catch (Exception exp) {
                exp.printStackTrace();
            }
        });
        thread.start();
        alert.showAndWait();
    }

    public void waitForRsponse(boolean response) {
        if (!response) {
            Alert alert = new Alert(Alert.AlertType.NONE);
            alert.setTitle("Title");
            alert.setContentText("waiting for response");
            alert.setResult(ButtonType.CANCEL);

            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(10000);
                    if (alert.isShowing()) {
                        Platform.runLater(() -> alert.close());
                    }
                } catch (Exception exp) {
                    exp.printStackTrace();
                }
            });
            thread.start();
            alert.showAndWait();
        }
    }

    //    exit game        
    public void exitTheGame() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.setTitle("Eixt game");
        alert.setHeaderText("Do you want to exit the game");
        alert.getButtonTypes().setAll(yes, no);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == yes) {
            nav.navigateToWelcome();
        }
    }

    ///  sign out
    public void signOut(Player p) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.setTitle("sign Out");
        alert.setHeaderText("Do you want to sign out ?");
        alert.getButtonTypes().setAll(yes, no);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == yes) {
            try {
                objectInputStream = ClientSocket.getObjectInputStreamInstance();
                objectOutputStream = ClientSocket.getObjectOutputStreamInstance();
                logOut = new LogOut(p.getUserName());
                objectOutputStream.writeObject(logOut);
                objectOutputStream.flush();
            } catch (StreamCorruptedException | EOFException | SocketException s) {
                showErrorInServer();
            } catch (IOException ex) {
                Logger.getLogger(onlinePlayersScreenBase.class.getName()).log(Level.SEVERE, null, ex);
            }
//            nav.navigateToWelcome();
        }
    }

    public void annimation() {

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        Media media = new Media(new File("src/assets/playerwin.mp4").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mv = new MediaView(mediaPlayer);

        DoubleProperty mvw = mv.fitWidthProperty();
        DoubleProperty mvh = mv.fitHeightProperty();
        mvw.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
        mvh.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));
        mv.setPreserveRatio(false);
        mediaPlayer.setAutoPlay(true);

        VBox vbox = new VBox();
        vbox.getChildren().add(mv);
        Scene scene = new Scene(vbox, 500, 400);
        stage.setScene(scene);
        stage.show();

        PauseTransition pt = new PauseTransition(javafx.util.Duration.seconds(10));
        pt.play();
        pt.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }

        });

        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                mediaPlayer.stop();
            }
        });
    }

    public void closeTheGame() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.setTitle("Exit");
        alert.setHeaderText("Are you Sure that you need to exit?");
        alert.getButtonTypes().setAll(yes, no);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == yes) {
            System.exit(0);

        }
    }

    public boolean askForResponse(String name) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType yes = new ButtonType("Accept", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("Decline", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.setTitle("Conformation Request");
        alert.setHeaderText(name + " sending you a game request,");
        alert.getButtonTypes().setAll(yes, no);
        Optional<ButtonType> result = alert.showAndWait();
        return result.get() == yes;
    }

    /*
     
      stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                closeOnLineScreen();
            }
        });

     */
    public void closeOnLineScreen() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.setTitle("Eixt game");
        alert.setHeaderText("Do you want to exit the game");
        alert.getButtonTypes().setAll(yes, no);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == yes) {
            System.out.println("asd");
        }
    }

    public boolean recordGame() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.setTitle("Access Record");
        alert.setHeaderText("Do you want to record game ?");
        alert.getButtonTypes().setAll(yes, no);
        Optional<ButtonType> result = alert.showAndWait();
        return result.get() == yes;
    }

}
