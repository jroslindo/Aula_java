/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meugeradordeprovas;

/**
 *
 * @author gusta
 */
public class Discursiva extends Questao {
    
    private String criteriosCorrecao;

    /**
     * @return the criteriosCorrecao
     */
    public String getCriteriosCorrecao() {
        return criteriosCorrecao;
    }

    /**
     * @param criteriosCorrecao the criteriosCorrecao to set
     */
    public void setCriteriosCorrecao(String criteriosCorrecao) {
        this.criteriosCorrecao = criteriosCorrecao;
    }

    @Override
    String retornaQuestao() {
        
        String questao = "";
        
        questao += this.getPergunta() + "\t" + "(" + this.getPeso() + ")" + "\n";
        
        return questao;
        
    }
    
}
