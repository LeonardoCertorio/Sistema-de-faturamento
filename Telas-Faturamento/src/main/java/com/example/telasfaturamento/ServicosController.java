package com.example.telasfaturamento;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ServicosController {
    @FXML
    public TextField entrada;
    @FXML
    public Label mensagem;

    public void executar(ActionEvent acionEvent) {
        var textoDigitado = entrada.getText();
        mensagem.setText(textoDigitado);
    }
}
