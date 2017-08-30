/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerador.de.prova;

/**
 *
 * @author 6182909
 */
public class Prova {
    
    private String nomeDaDisciplina;
    private int peso;
    private String local;
    private String data;
    private Objetiva[] questaoO;
    private Discursiva[] questaoD;
   
    
    public Prova(String nome){
        this.nomeDaDisciplina = nome;
        this.peso = 10;
    }
         
    public String obtemDetalhes(){
        
        String retorno = "\t\t\t"+this.getNomeDaDisciplina()+"\n\n"+"Nome: _________________________________ "+
                         "\tData: "+ this.getData() +"\nLocal: " + this.getLocal() + "\t\t\t\tPeso: " + this.getPeso();
                         
        return retorno;
       
    }

    //public String obtemProvaImpressao(Discursiva qdiscursiva[], Objetiva qobjetiva[], int ndiscursiva, int nobjetiva){
    public String obtemProvaImpressao(){
        String auxiliar=obtemDetalhes()+"\n\n";
        
        System.out.println ("\n\nTeste:" + this.getQuestaoD()[0].getPergunta());
        
        for (int i=0; i<this.getQuestaoD().length; i++){
            auxiliar += this.getQuestaoD()[i].retornaQuestao();
        }
        
        for (int i=0; i<this.getQuestaoO().length; i++){
            auxiliar += this.getQuestaoO()[i].retornaQuestao();
        }
        
        
        
        return auxiliar;        
    }
    public String getNomeDaDisciplina() {
        return nomeDaDisciplina;
    }

    public void setNomeDaDisciplina(String nomeDaDisciplina) {
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    /*public String obtemProvaImpressao(){
        String impressao="";
        
        return impressao;
    }*/

    /**
     * @return the questaoO
     */
    public Objetiva[] getQuestaoO() {
        return questaoO;
    }

    /**
     * @param questaoO the questaoO to set
     */
    public void setQuestaoO(Objetiva[] questaoO) {
        this.questaoO = questaoO;
    }

    /**
     * @return the questaoD
     */
    public Discursiva[] getQuestaoD() {
        return questaoD;
    }

    /**
     * @param questaoD the questaoD to set
     */
    public void setQuestaoD(Discursiva[] questaoD) {
        this.questaoD = questaoD;
    }
}
