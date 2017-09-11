/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.de.resistencia;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author João
 */
public class JanelaPrincipal extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage Stage) throws Exception {
        VBox orquestrador = new VBox();
        orquestrador.setSpacing(10);
        
        Label label1 = new Label("Valor do resistor: ");
        TextField entrada = new TextField();
        Label resultado = new Label("Resultado: ");
        
        HBox orquestrador2 = new HBox();
        Button adicionar = new Button("Adicionar resistor");
        Button paralelo = new Button("paralelo");
        Button serie = new Button ("Serie");
        
        Double [] vetor = new Double[5];        
        int[] i = new int [1];
        i[0]=0;
        
        adicionar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(i[0] <5){
                vetor[i[0]] = Double.parseDouble(entrada.getText());
                i[0]++;
                }else{
                   JOptionPane.showMessageDialog(null, "Numero maximo de resistores atingido");
                }
            }
        });
        
        serie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double soma=0.00;
                for(int x=0; x<=i[0];x++){
                    if(x==i[0])
                        break;
                    soma += vetor[x];
                    System.out.println("teste; " + soma);
                }
                resultado.setText("Resistencia = " + soma);                
            }
        });
        
        paralelo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double soma=0.00;
                for(int x=0; x<=i[0];x++){
                    if(x==i[0]){
                        System.out.println("Final " + soma);
                        soma += 1/soma;
                        break;
                    }
                    soma += 1/vetor[x];
                    System.out.println("teste; " + soma);
                }
                resultado.setText("Resistencia = " + soma);                
            }
        });
        
        orquestrador2.getChildren().add(adicionar);
        orquestrador2.getChildren().add(serie);
        orquestrador2.getChildren().add(paralelo);
        
        
        orquestrador.getChildren().add(label1);
        orquestrador.getChildren().add(entrada);
        orquestrador.getChildren().add(orquestrador2);
        orquestrador.getChildren().add(resultado);
        
        
        Scene cena = new Scene(orquestrador, 350,200);
        Stage.setScene(cena);
        Stage.setTitle("Calculadora alfa beta gama 0.00001");
        Stage.show();
    }
    
}
