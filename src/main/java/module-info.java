module com.example.frontendakselfinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainPkg to javafx.fxml;
    exports mainPkg;
}