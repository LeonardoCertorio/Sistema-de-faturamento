module com.example.telasfaturamento {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.telasfaturamento to javafx.fxml;
    exports com.example.telasfaturamento;
}