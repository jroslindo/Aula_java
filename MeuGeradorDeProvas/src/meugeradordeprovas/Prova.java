/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meugeradordeprovas;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Prova {
    
    private String nomeDisciplina;
    private int peso;
    private String local;
    private String data;
    private ArrayList<Questao> listaQuestoes;
    
    public Prova(){
        this.listaQuestoes = new ArrayList();
    }
    
    public String imprimirProva(){
        
        String prova = "\n\n";
        
        prova += "Nome:________________________" + "\t" + "Data:" + this.getData() + "\n";
        prova += "Local:" + this.getLocal() + "\t" + "Peso:" + this.getPeso() + "\n";
        
        for(int i = 0; i<this.getListaQuestoes().size(); i++){
            prova += "\n" + (i+1) + ")" + this.listaQuestoes.get(i).retornaQuestao();
        }
        
        
        return prova;
    }

    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the listaQuestoes
     */
    public ArrayList<Questao> getListaQuestoes() {
        return listaQuestoes;
    }

    /**
     * @param listaQuestoes the listaQuestoes to set
     */
    public void setListaQuestoes(ArrayList<Questao> listaQuestoes) {
        this.listaQuestoes = listaQuestoes;
    }
        
}
