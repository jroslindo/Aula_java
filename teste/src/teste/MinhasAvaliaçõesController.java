/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author João
 */
public class MinhasAvaliaçõesController extends InterfaceUsuario {

    public MinhasAvaliaçõesController() {
        super("Minhas Avaliações.fxml");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void vaiParaNovaAvaliação (ActionEvent evento){
        AdicionarNovaAvaliaçãoController proximaTela = new AdicionarNovaAvaliaçãoController();
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
    }
    
    @FXML
    public void vaiParaInformarNota (ActionEvent evento){
        InformarNotaController proximaTela = new InformarNotaController();
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
    }
    
    @FXML
    public void voltar (ActionEvent evento){        
        GerenciadorJanela.obterInstancia().voltar();
    }
    
}
