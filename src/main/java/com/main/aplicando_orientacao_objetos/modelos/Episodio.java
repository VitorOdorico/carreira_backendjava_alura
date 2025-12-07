package com.main.aplicando_orientacao_objetos.modelos;

import com.main.aplicando_orientacao_objetos.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String titulo;
    private Serie serie;
    private int totalDeVisualizacoes;

    @Override
    public int getClassificacao() {
        if(totalDeVisualizacoes > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
