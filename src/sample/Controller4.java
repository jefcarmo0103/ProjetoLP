package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller4 implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void alterarCliente(ActionEvent actionEvent) {
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }

    public void incluirCliente(ActionEvent actionEvent) {
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }

    public void buscaExecutada(ActionEvent actionEvent) {
    }
}
