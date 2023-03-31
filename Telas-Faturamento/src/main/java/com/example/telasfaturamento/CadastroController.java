package com.example.telasfaturamento;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CadastroController {
    @FXML
    private Label Cadastrar;
    @FXML
    private Label Cancelar;

    @FXML
    protected void onCadastrar() {

        Cadastrar.setText("voce cadastrou!");
    }

    public void onCancelar(ActionEvent actionEvent) {
        Cancelar.setText("voce cancelou!");
    }
}