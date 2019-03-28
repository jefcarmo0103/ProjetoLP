package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

    public void pesquisaProduto(ActionEvent actionEvent){

    }

    public void finalizaPedido(ActionEvent actionEvent) {
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("sample3.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 420, 323));
            stage.show();
        }
        catch (IOException err){
            err.printStackTrace();
        }
    }

    public void adicionaQtd(ActionEvent actionEvent) {
        
    }

    public void subtraiQtd(ActionEvent actionEvent) {
    }

    public void adicionaItem(ActionEvent actionEvent) {
    }
}
