/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerador.de.prova;
import java.util.Scanner;
/**
 *
 * @author 6182909
 */
public class GeradorDeProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int nDiscursiva, nobjetiva;

        Prova p1 = new Prova("Fisica");  
        
        p1.setData("15/08/2017");
        p1.setLocal("Itajai - Lab 4");       
        
        System.out.println("Digite o nome da disciplina");
        p1.setNomeDaDisciplina(s.nextLine());
        
        System.out.println("Digite o Peso da prova");
        p1.setPeso(s.nextInt());
        s.nextLine();
        
        System.out.println("Digite o local da prova");
        p1.setLocal(s.nextLine());
        
        
        System.out.println("Digite a data da prova");
        p1.setData(s.nextLine());
        
        System.out.println("Digite o numero de questoes discursivas: ");
        nDiscursiva = Integer.parseInt(s.nextLine());       
        
        Discursiva[] questoesD = new Discursiva[nDiscursiva];
        
        int i;
        for (i=0; i<nDiscursiva; i++){
            questoesD[i] = new Discursiva();
            
            i++;
            System.out.println("Pergunta da questão " + i);
            i--;
            questoesD[i].setPergunta(s.nextLine());
            
            
            System.out.println("Peso: ");
            
            questoesD[i].setPeso(Integer.parseInt(s.nextLine()));
            
            
            System.out.println("Criterio de avaliação");
            questoesD[i].setCriteriosCorrecao(s.nextLine());
        }
        p1.setQuestaoD(questoesD);
        
        System.out.println("Digite o numero de questoes Objetivas: ");
        nobjetiva = Integer.parseInt(s.nextLine());      
        
        Objetiva[] questoesO = new Objetiva [nobjetiva];
        String[] auxiliar;
        
        for (i=0; i<nobjetiva; i++){
            auxiliar= new String [5];
            questoesO[i]=new Objetiva();            
         
            i++;
            System.out.println("Pergunta da questão " + i);
            i--;
            questoesO[i].setPergunta(s.nextLine());
            
            
            System.out.println("Peso: ");
            questoesO[i].setPeso(Integer.parseInt(s.nextLine()));
            
            
            System.out.print("A) ");
            auxiliar[0]= s.nextLine();
            
            System.out.print("B) ");
            auxiliar[1]= s.nextLine();
            
            System.out.print("C) ");
            auxiliar[2]= s.nextLine();
            
            System.out.print("D) ");
            auxiliar[3]= s.nextLine();
            
            System.out.print("E) ");
            auxiliar[4]= s.nextLine();
            
            questoesO[i].setOpcoes(auxiliar);
            
            System.out.println("Questão correta");
            questoesO[i].setRespostaCorreta(Integer.parseInt(s.nextLine()));
            
        }
        
        p1.setQuestaoO(questoesO);
        
        System.out.println("\n\n"+p1.obtemProvaImpressao());
        //System.out.println (p1.obtemDetmatealhes());
        
        
        
    }
    
}
