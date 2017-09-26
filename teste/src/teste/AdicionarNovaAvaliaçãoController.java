/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author João
 */
public class AdicionarNovaAvaliaçãoController extends InterfaceUsuario {

    public AdicionarNovaAvaliaçãoController() {
        super("Adicionar nova avaliação.fxml");
    }
    
    ObservableList<String> ListaDeDisciplinas = FXCollections.observableArrayList("teste");
    ObservableList<String> ListaMs = FXCollections.observableArrayList("M1","M2","M3");
    /**
     * Initializes the controller class.
     */
    @FXML
    private ComboBox ComboDisciplina;
    @FXML
    private ComboBox ComboMs;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ComboDisciplina.setItems(ListaDeDisciplinas);
        ComboMs.setItems(ListaMs);
    }    
    
    @FXML
    public void voltar (ActionEvent evento){
        GerenciadorJanela.obterInstancia().voltar();
    }
}
