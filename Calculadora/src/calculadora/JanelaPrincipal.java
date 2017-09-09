/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

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

/**
 *
 * @author João
 */
public class JanelaPrincipal extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch (args);
    }

    @Override
    public void start(Stage Stage) throws Exception {
        //view group 1
        VBox orquestrador = new VBox();
        orquestrador.setSpacing(10);
        
        
        Label Escrita1 = new Label("Valor 1:");
        TextField Valor1 = new TextField ("----");
        Label Escrita2 = new Label("Valor 2:");
        TextField Valor2 = new TextField ("----");
        Label Resultado = new Label("Resultado: ");
        
        //view group 2
        HBox orquestrador2 = new HBox();
        Button somar = new Button("Somar");
        Button dividir = new Button ("Dividir");
        Button subtrair = new Button ("Subtrair");
        Button multiplicar = new Button ("Multiplicar");
        
        //função para os botoes
        somar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               String numero1 = Valor1.getText();
               double num1EmDouble = Double.parseDouble(numero1);
               String numero2 = Valor2.getText();
               double num2EmDouble = Double.parseDouble(numero2);
               double numResultado = num1EmDouble + num2EmDouble;
               Resultado.setText( "Resultado: "+numResultado);
            }
        });
        
        dividir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               String numero1 = Valor1.getText();
               double num1EmDouble = Double.parseDouble(numero1);
               String numero2 = Valor2.getText();
               double num2EmDouble = Double.parseDouble(numero2);
               double numResultado = num1EmDouble / num2EmDouble;
               Resultado.setText( "Resultado: "+numResultado);
            }
        });
        
        subtrair.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               String numero1 = Valor1.getText();
               double num1EmDouble = Double.parseDouble(numero1);
               String numero2 = Valor2.getText();
               double num2EmDouble = Double.parseDouble(numero2);
               double numResultado = num1EmDouble - num2EmDouble;
               Resultado.setText( "Resultado: "+numResultado);
            }
        });
        
        multiplicar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               String numero1 = Valor1.getText();
               double num1EmDouble = Double.parseDouble(numero1);
               String numero2 = Valor2.getText();
               double num2EmDouble = Double.parseDouble(numero2);
               double numResultado = num1EmDouble * num2EmDouble;
               Resultado.setText( "Resultado: "+numResultado);
            }
        });
        
        
        //adicionando para o 2
        orquestrador2.getChildren().add(somar);
        orquestrador2.getChildren().add(dividir);
        orquestrador2.getChildren().add(subtrair);
        orquestrador2.getChildren().add(multiplicar);
        
        
        //adicionando para o 1
        orquestrador.getChildren().add(Escrita1);
        orquestrador.getChildren().add(Valor1);
        orquestrador.getChildren().add(Escrita2);
        orquestrador.getChildren().add(Valor2);
        orquestrador.getChildren().add(Resultado);
        orquestrador.getChildren().add(orquestrador2);
        
        
        //Stage
        Scene cena = new Scene(orquestrador, 245,200);
        Stage.setScene(cena);
        Stage.setTitle("Calculadora :D");
        Stage.show();
        
    }
    
}
