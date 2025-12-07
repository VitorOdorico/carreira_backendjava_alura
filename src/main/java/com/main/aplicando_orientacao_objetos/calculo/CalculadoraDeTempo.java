package com.main.aplicando_orientacao_objetos.calculo;

import com.main.aplicando_orientacao_objetos.modelos.Filme;
import com.main.aplicando_orientacao_objetos.modelos.Serie;
import com.main.aplicando_orientacao_objetos.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal = 0;

//    public void inclui(Filme filme) {
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie) {
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

}
