package mainPkg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class addPersonController extends GUI{

    @FXML
    private TextField dateOfBirthInput;

    @FXML
    private TextField firstNameInput;

    @FXML
    private TextField lastNameInput;

    @FXML
    void addPersonToDatabase(ActionEvent event) {
        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.sendRequest("addPerson/?valuesAsCSV=" + "," + firstNameInput.getText() + "," + lastNameInput.getText() + "," + dateOfBirthInput.getText());
    }

    @FXML
    void goToStartPage(ActionEvent event) {
        try {launchStartPage();} catch (IOException e) {e.printStackTrace();}
    }

}

