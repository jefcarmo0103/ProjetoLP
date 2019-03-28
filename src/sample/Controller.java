package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void novaVenda(ActionEvent actionEvent){
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 522, 525));
            stage.show();
        }
        catch (IOException err){
            err.printStackTrace();
        }
    }

    public void novaCompra(ActionEvent actionEvent){
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("sample6.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 522, 643));
            stage.show();
        }
        catch (IOException err){
            err.printStackTrace();
        }
    }

    public void handleKeyInput(KeyEvent keyEvent) {
    }

    public void handleAboutAction(ActionEvent actionEvent) {
    }

    public void abreFornecedores(ActionEvent actionEvent) {
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("sample5.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 291, 275));
            stage.show();
        }
        catch (IOException err){
            err.printStackTrace();
        }
    }

    public void estoque(ActionEvent actionEvent) {
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("sample8.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 502, 258));
            stage.show();
        }
        catch (IOException err){
            err.printStackTrace();
        }
    }

    public void abrirEstoque(ActionEvent actionEvent) {
        estoque(actionEvent);
    }
}
