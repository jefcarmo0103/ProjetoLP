package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller3 implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void finalizarVenda(ActionEvent actionEvent) {
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }

    public void novoCliente(ActionEvent actionEvent) {
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("sample4.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 267, 240));
            stage.show();
        }
        catch (IOException err){
            err.printStackTrace();
        }
    }
}
