/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author João
 */
public class InformarNotaController extends InterfaceUsuario {

    public InformarNotaController() {
        super("Informar Nota.fxml");
    }
    public int index;
    @FXML 
    public TextField notaid;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void voltar (ActionEvent evento){
        GerenciadorJanela.obterInstancia().voltar();
    }
    
    @FXML
    public void salvar (ActionEvent evento){
         ArrayList <String> salva= new ArrayList();
        try {
            FileReader arq = new FileReader("Relatorio.csv");
            BufferedReader lerArq = new BufferedReader(arq);
           
            String linha = lerArq.readLine();
            while (linha != null) {
                salva.add(linha);               
                linha = lerArq.readLine();
            }            
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        
        String modifica = salva.get(index);
        modifica += notaid.getText();
        salva.remove(index);
        salva.add(index, modifica);
        int i=0;
        while (i < salva.size()){
            System.out.println(salva.get(i));
            i++;
        }
        
        try {
            File arquivo = new File("Relatorio.csv");
            FileWriter fw = new FileWriter(arquivo);
            for (i=0; i<salva.size();i++){
                fw.write(salva.get(i)+"\n");
            }
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println("Não foi possivel abrir ou criar o arquivo");
        }
        
        Avaliacao volta = new Avaliacao();
        volta.atualizar();
        
    }
    
}
