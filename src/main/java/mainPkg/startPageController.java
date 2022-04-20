package mainPkg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class startPageController extends GUI{

    @FXML
    void goToAddPersonScreen(ActionEvent event) {
        try {launchAddPersonPage();} catch (IOException e) {e.printStackTrace();}
    }

    @FXML
    void quitApp(ActionEvent event) {
        System.exit(0);
    }
}
