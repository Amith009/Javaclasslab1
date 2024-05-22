module com.example.javaclasslab1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaclasslab1 to javafx.fxml;
    exports com.example.javaclasslab1;
}