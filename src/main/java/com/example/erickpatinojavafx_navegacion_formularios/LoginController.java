package com.example.erickpatinojavafx_navegacion_formularios;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private PasswordField txtPassword;

    @FXML
    private ComboBox<String> cmbRol;

    @FXML
    public void initialize() {
        cmbRol.getItems().addAll("Administrador", "Cajero");
    }

    @FXML
    private TextField txtNombre;


    @FXML
    private Label lbInfo;

    @FXML
    protected void ingresar() {
        String nombre = txtNombre.getText();
        String password = txtPassword.getText();
        String rol = cmbRol.getValue();
        if (rol == null) {
            lbInfo.setText("Seleccione un rol");
            return;
        }
        try {
            if (nombre.equals("Admin") && password.equals("123") && rol.equals("Administrador")) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("Administrador.fxml"));

                Stage stage = new Stage();
                stage.setScene(new Scene(loader.load()));
                stage.show();

                ((Stage) txtNombre.getScene().getWindow()).close();

            } else if (nombre.equals("Cajero") && password.equals("123") && rol.equals("Cajero")) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("Cajero.fxml"));

                Stage stage = new Stage();
                stage.setScene(new Scene(loader.load()));
                stage.show();

                ((Stage) txtNombre.getScene().getWindow()).close();

            } else {
                lbInfo.setText("Usuario, contraseña o rol incorrectos");
            }
        } catch (Exception e) {
            lbInfo.setText("Error al abrir formulario");
        }
    }

    @FXML
    protected void salir() {
        ((Stage) txtNombre.getScene().getWindow()).close();
    }
}
