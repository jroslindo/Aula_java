/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author joao
 */
public class Avaliacao {
    private String nome;
    private String disciplina;
    private Double peso;
    private char[] media = new char [2];
    private Double nota;
    
    // <<Controle>>
    private int identificadorNoArquivo;
    
    public void salvar(){ //escreve no arquivo
        try {       
            File arquivo = new File("Relatorio.csv");
            FileWriter fw = new FileWriter(arquivo, true);  
            fw.write(this.nome + ", " + this.disciplina + ", " + this.peso+"\n");
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
