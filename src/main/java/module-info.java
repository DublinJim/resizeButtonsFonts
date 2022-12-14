module com.example.resizebuttonsfonts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.resizebuttonsfonts to javafx.fxml;
    exports com.example.resizebuttonsfonts;
}