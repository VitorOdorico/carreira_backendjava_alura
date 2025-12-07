package com.main.aplicando_orientacao_objetos.minhasMusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() +  "é considerado sucesso absoluto e preferido por todos");
        }else{
            System.out.println(audio.getTitulo()+ "é o que geral está curtindo");
        }
    }
}
