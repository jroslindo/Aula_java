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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author joao
 */
public class RelatorioController extends InterfaceUsuario {

    @FXML
    private ComboBox Comboid;
    /**
     * Initializes the controller class.
     */
    @FXML
    private BarChart<?,?> graficoid;
    @FXML
    private CategoryAxis xid;
    @FXML
    private NumberAxis yid;
    
    
    ObservableList<String> ListaDeDisciplinas = FXCollections.observableArrayList("Fisica", "Matematica");

    public RelatorioController() {
        super("Relatorio.fxml");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Comboid.setItems(ListaDeDisciplinas);
    }  
    public void voltar (ActionEvent evento){
        GerenciadorJanela.obterInstancia().voltar();
    }
    
    @FXML
    public void Mostrar (){  
        //grafico   
        XYChart.Series setTira = new XYChart.Series();
        
        setTira.getData().add(new XYChart.Data("M1", 10));
        setTira.getData().add(new XYChart.Data("M2", 5));
        graficoid.getData().addAll(setTira);
    }
    
}
