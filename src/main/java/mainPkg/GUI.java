package mainPkg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {
    private static Stage mainStage;

    public static void main(String[] args) {
        launch(args);
    }

    public void launchAddPersonPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("addPersonPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        mainStage.setTitle("addPersonPage");
        mainStage.setScene(scene);
        mainStage.show();
    }

    public void launchStartPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("startPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        mainStage.setTitle("startPage");
        mainStage.setScene(scene);
        mainStage.show();
    }

    @Override
    public void start(Stage placeHolder) throws IOException {
        mainStage = placeHolder;
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("startPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainStage.setTitle("startPage");
        mainStage.setScene(scene);
        mainStage.show();
    }
}
