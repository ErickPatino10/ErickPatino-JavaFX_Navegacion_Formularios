package com.example.erickpatinojavafx_navegacion_formularios;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EncuestaController {

    @FXML
    private TextField txtB1;

    @FXML
    private TextField txtB2;

    @FXML
    private TextField txtB3;

    @FXML
    private TextField txtB4;

    @FXML
    private Label lbResultado;

    @FXML
    public void calificar() {

        int correctas = 0;

        if (txtB1.getText().equals("Quito")) {
            correctas++;
        }

        if (txtB2.getText().equals("Pacifico")) {
            correctas++;
        }

        if (txtB3.getText().equals("7")) {
            correctas++;
        }

        if (txtB4.getText().equals("Marte")) {
            correctas++;
        }

        int incorrectas = 4 - correctas;
        int puntaje = correctas * 5;

        lbResultado.setText(
                "Puntaje: " + puntaje +
                        "\nCorrectas: " + correctas +
                        "\nIncorrectas: " + incorrectas
        );
    }
}