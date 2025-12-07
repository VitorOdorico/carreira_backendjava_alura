package com.main.aplicando_orientacao_objetos.minhasMusicas;

import com.main.aplicando_orientacao_objetos.minhasMusicas.modelos.MinhasPreferidas;
import com.main.aplicando_orientacao_objetos.minhasMusicas.modelos.Musica;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Rap da akatsuki");
        minhaMusica.setCantor("7minutos");
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
       minhaMusica.imprimir();

        MinhasPreferidas minhaPreferidas = new MinhasPreferidas();
        minhaPreferidas.inclui(minhaMusica);


    }
}
