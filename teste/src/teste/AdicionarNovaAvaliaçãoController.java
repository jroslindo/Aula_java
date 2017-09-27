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
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author João
 */
public class AdicionarNovaAvaliaçãoController extends InterfaceUsuario{

    public AdicionarNovaAvaliaçãoController() {
        super("Adicionar nova avaliação.fxml");
    }    
    ObservableList<String> ListaDeDisciplinas = FXCollections.observableArrayList("Fisica", "Matematica");
    ObservableList<String> ListaMs = FXCollections.observableArrayList("M1","M2","M3");
    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ComboBox ComboDisciplina;
    @FXML
    private ComboBox ComboMs;
    @FXML
    private TextField textNome;
    @FXML
    private TextField textPeso;    
    
    public MinhasAvaliaçõesController referencia;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ComboDisciplina.setItems(ListaDeDisciplinas);
        ComboMs.setItems(ListaMs);
    }    
    
    @FXML
    public void voltar (ActionEvent evento){
        GerenciadorJanela.obterInstancia().voltar();
    }
    
    @FXML
    public void salvar (ActionEvent evento){
        Avaliacao salvada= new Avaliacao ();
        
        salvada.setNome(textNome.getText());
        salvada.setPeso(Double.parseDouble(textPeso.getText()));
        salvada.setDisciplina((String) ComboDisciplina.getValue());
        salvada.setMedia (((String) ComboMs.getValue()).toCharArray());
        salvada.salvar();
        
        
        
        salvada.atualizar();
        //GerenciadorJanela.obterInstancia().voltar();
        
    }
}
