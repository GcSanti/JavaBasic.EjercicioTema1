module com.example.javabasicejerciciotema1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javabasicejerciciotema1 to javafx.fxml;
    exports com.example.javabasicejerciciotema1;
}