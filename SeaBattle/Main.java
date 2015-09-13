package SeaBattle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    Stage window;
    public Scene sceneName, sceneGame;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent mainForm = FXMLLoader.load(getClass().getResource("forms/mainForm.fxml"));
        Parent nameForm = FXMLLoader.load(getClass().getResource("forms/nameForm.fxml"));

        ImageView im = (ImageView) mainForm.lookup("#pc");
        Image image = new Image(new File("human.jpg").toURI().toString());
        im.setImage(image);
        im.minHeight(20);
        im.minWidth(20);

        Label l = (Label) mainForm.lookup("#testik");
        l.setText("khbdkbkbefgkeb");
        l.setTextFill(Paint.valueOf("#FFF"));

        window = primaryStage;
        Label labelName = new Label("Enter your name");
        //primaryStage.setTitle("Hello World!");
        Button buttonOk = new Button("OK22");
        buttonOk.setOnAction(e -> window.setScene(new Scene(mainForm)));
        //buttonOk.setOnAction(e -> window.setScene(new Scene(mainForm)));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(labelName, buttonOk);
        sceneName = new Scene(layout1, 200, 200);

        StackPane layout = new StackPane();
        layout.getChildren().add(buttonOk);
        primaryStage.setTitle("Enter your name!");
        primaryStage.setScene(new Scene(mainForm, 300, 300));
        primaryStage.setResizable(true);
        primaryStage.show();

    }
}
