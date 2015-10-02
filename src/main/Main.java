package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private Stage primaryStage;
    private Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Super Archiver");

        initRootLayout();
    }

    public void initRootLayout() {
        try {
            root = FXMLLoader.load(getClass().getResource("../view/RootLayout.fxml"));
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showFilesOverwies() {

    }

    public static void main(String[] args) {
        launch(args);
    }
}
