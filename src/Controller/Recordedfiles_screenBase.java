package Controller;

import Controller.saveSteps;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Recordedfiles_screenBase extends AnchorPane {

    protected final ListView recordedfiles_listview;
    protected final Button back_btn;
    protected final ImageView imageView;
    protected saveSteps s;
    protected Navigation nav;

    ObservableList<String> filesObservableList;
    String[] recFiles;

    public Recordedfiles_screenBase() {

        recordedfiles_listview = new ListView();
        back_btn = new Button();
        imageView = new ImageView();
        s = new saveSteps();
        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        recordedfiles_listview.setLayoutX(14.0);
        recordedfiles_listview.setLayoutY(19.0);
        recordedfiles_listview.setPrefHeight(334.0);
        recordedfiles_listview.setPrefWidth(574.0);

        back_btn.setLayoutX(37.0);
        back_btn.setLayoutY(361.0);
        back_btn.setMnemonicParsing(false);
        back_btn.setPrefHeight(30.0);
        back_btn.setPrefWidth(99.0);
        back_btn.setText("back");
        nav = new Navigation();
        back_btn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nav.navigateToWelcome();
            }
        });
//=====================================================================================
        imageView.setFitHeight(30.0);
        imageView.setFitWidth(30.0);
        imageView.setLayoutX(37.0);
        imageView.setLayoutY(361.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
//        imageView.setImage(new Image(getClass().getResource("assets/back.png").toExternalForm()));

        getChildren().add(recordedfiles_listview);
        getChildren().add(back_btn);
        getChildren().add(imageView);
        saveSteps step = new saveSteps();
        recFiles = step.recordedFiles();
        filesObservableList = FXCollections.observableArrayList(recFiles);
        recordedfiles_listview.setItems(filesObservableList);

        recordedfiles_listview.getSelectionModel()
                .selectedItemProperty().addListener(new ChangeListener<String>() {

                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                        System.out.println(newValue);
                        s.loadFileName = newValue;
                        s.loadScreen();
                        nav.navigateToDisplayRecord();
                    }
                }
                );
    }

}
