/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joao
 */
public class Avaliacao {

    private String nome;
    private String disciplina;
    private Double peso;
    private char[] media = new char[2];
    private Double nota;

    // <<Controle>>
    private int identificadorNoArquivo;

    static public ArrayList<Avaliacao> obterListaAvaliacoes() {
        ArrayList<Avaliacao> retorno = new ArrayList();
        int index = 0;
        try {
            FileReader arq = new FileReader("Relatorio.csv");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.printf("%s\n", linha);
                String[] separado = linha.split(",");
                Avaliacao av = new Avaliacao();
                av.setNome(separado[0]);
                av.setDisciplina(separado[1]);
                av.setMedia(separado[2].toCharArray());
                av.setPeso(Double.parseDouble(separado[3]));
                av.setIdentificadorNoArquivo(index);
                index++;
                retorno.add(av);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        return retorno;
    }

    public void salvar() { //escreve no arquivo
        try {
            File arquivo = new File("Relatorio.csv");
            FileWriter fw = new FileWriter(arquivo, true);
            fw.write(this.nome + "," + this.disciplina + "," + this.media[0] + this.media[1] + "," + this.peso + "," + "\n");
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println("Não foi possivel abrir ou criar o arquivo");
        }
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(char[] media) {
        this.media = media;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(Double nota) {
        this.nota = nota;
    }

    /**
     * @param identificadorNoArquivo the identificadorNoArquivo to set
     */
    public void setIdentificadorNoArquivo(int identificadorNoArquivo) {
        this.identificadorNoArquivo = identificadorNoArquivo;
    }
}
