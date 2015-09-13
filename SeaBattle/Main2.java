package SeaBattle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main2 extends Application {
    Stage window;
    Scene sceneName, sceneGame;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Parent mainForm = FXMLLoader.load(getClass().getResource("forms/mainForm.fxml"));

        Label label1 = new Label("Enter your name");
        Button button1 = new Button("OK");
        button1.setOnAction(e -> window.setScene(new Scene(mainForm, 780, 620)));

        TextField textField = new TextField();
        textField.setMaxWidth(130);

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, textField, button1);
        sceneName = new Scene(layout1, 200, 200);

        window.setScene(sceneName);
        window.setTitle("Sea Battle");
        window.show();
    }
}
