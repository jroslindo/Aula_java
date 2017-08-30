/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meugeradordeprovas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class MeuGeradorDeProvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);
        Prova p = new Prova();

        System.out.print("Nome da Disciplina seu idiota: ");
        p.setNomeDisciplina(s.nextLine());

        System.out.print("Local: ");
        p.setLocal(s.nextLine());

        System.out.print("Data: ");
        p.setData(s.nextLine());

        System.out.print("Peso: ");
        p.setPeso(s.nextInt());
        s.nextLine();

        while (true) {

            System.out.print("\nQual o tipo de questão que deseja inserir?");
            System.out.print("\n-O para Objetiva \n-D para Discursiva \n-X para sair\n ");
            String decisao = s.nextLine();

            if (decisao.equalsIgnoreCase("X")) {
                break;
            } else if (decisao.equalsIgnoreCase("O")) {
                //criar uma questão objetiva
                Objetiva o = new Objetiva();
                String alternativas[] = new String[5];
                System.out.print("Insira a pergunta: ");
                o.setPergunta(s.nextLine());
                System.out.print("Insira o peso: ");
                o.setPeso(s.nextDouble());
                s.nextLine();

                for (int j = 0; j < 5; j++) {
                    System.out.print("[" + (j + 1) + "]" + "Alternativa: ");
                    alternativas[j] = s.nextLine();
                }

                o.setOpcoes(alternativas);
                System.out.print("Insira a alternativa correta: ");
                o.setRespostaCorreta(s.nextInt());
                p.getListaQuestoes().add(o); /// ADICIONANDO AO ARRAY

            } else if (decisao.equalsIgnoreCase("D")) {
                //criar questão discursiva
                Discursiva d = new Discursiva();
                System.out.print("Insira a pergunta: ");
                d.setPergunta(s.nextLine());
                System.out.print("Insira o peso: ");
                d.setPeso(s.nextDouble());
                s.nextLine();
                System.out.print("Insira o criterio de correção: ");
                d.setCriteriosCorrecao(s.nextLine());
                p.getListaQuestoes().add(d); /// ADICIONANDO AO ARRAY

            } else {
                System.out.print("Opção inválida");
            }
        }
        System.out.println(p.imprimirProva());
    }
    
}
