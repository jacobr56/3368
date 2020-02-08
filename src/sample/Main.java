package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); //backdrop for scene
        primaryStage.setTitle("Employee Manager 2000"); //title for stage
        primaryStage.setScene(new Scene(root, 300, 275)); //new scene, backdrop, and size
        primaryStage.show(); //turning the lights on, show the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}
