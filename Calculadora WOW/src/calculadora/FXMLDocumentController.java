/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 *
 * @author gusta
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label Valor;
    
    @FXML 
    private CheckBox Check1;
    
    @FXML
    private CheckBox Check2;
    
    @FXML
    private CheckBox Check3;
    
    @FXML
    private CheckBox check4;
    
    @FXML
    private Label Resultado;
        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void ClicouCalcular (){
        Resultado.setText("TESTANDO");
    }
    
}
