package com.main.aplicando_orientacao_objetos.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double valorDeAluguel = 12.90;
    private double avaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void exibirFichaTecnica(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
        if(this.incluidoNoPlano){
            System.out.println("Incluido no plano");
        }else{
            System.out.println("Não incluso no plano, terá que ser alugado no valor de: " + this.valorDeAluguel);
        }
        System.out.println("Avaliações: " + this.calculaMediaAvaliacoes());
        System.out.println("Total de avaliações: " + this.totalDeAvaliacoes);
        System.out.println("Duração em minutos: " + this.duracaoEmMinutos);
    }
    public void avalia(double nota){
        avaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public double calculaMediaAvaliacoes(){
        return avaliacoes = avaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getValorDeAluguel() {
        return valorDeAluguel;
    }

    public void setValorDeAluguel(double valorDeAluguel) {
        this.valorDeAluguel = valorDeAluguel;
    }

    public double getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(double avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
