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
public class Objetiva extends Questao {
    
    private String opcoes[] = new String[5];
    private int respostaCorreta;

    /**
     * @return the opcoes
     */
    public String[] getOpcoes() {
        return opcoes;
    }

    /**
     * @param opcoes the opcoes to set
     */
    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    /**
     * @return the respostaCorreta
     */
    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    /**
     * @param respostaCorreta the respostaCorreta to set
     */
    public void setRespostaCorreta(int respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    @Override
    String retornaQuestao() {
        
        String questao = "";
        
        questao += this.getPergunta() + "\t" + "(" + this.getPeso() + ")" + "\n";
        questao += "[" + 1 + "]" + this.getOpcoes()[0] + "\n";
        questao += "[" + 2 + "]" + this.getOpcoes()[1] + "\n";
        questao += "[" + 3 + "]" + this.getOpcoes()[2] + "\n";
        questao += "[" + 4 + "]" + this.getOpcoes()[3] + "\n";
        questao += "[" + 5 + "]" + this.getOpcoes()[4] + "\n";
        
        return questao;
        
    }
    
    
}
