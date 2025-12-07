package com.main.aplicando_orientacao_objetos.minhasMusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducao;
    private int totalCurtidas;
    private double Classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return Classificacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduzir(){
        this.totalReproducao++;
    }
    public void imprimir(){
        System.out.println(this.titulo);
        System.out.println(this.totalCurtidas);
        System.out.println(this.totalReproducao);
    }
}
