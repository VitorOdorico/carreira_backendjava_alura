package com.main.criando_primeira_aplicacao.Screenmatch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao Screenmatch");

        int ano = 2022;
        String nome = "Maverick";
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double mediaNotaDoFilme = (8.1 + 6.3 + 8.0)/3;

        System.out.println("Filme: Top gun: "+ nome);
        System.out.println(String.format("Media de classificação: %.2f", mediaNotaDoFilme)+"/10");
        System.out.println("Ano de lançamento: "+ ano);
        if(incluidoNoPlano) {
            System.out.println(nome+ ": Incluido no plano");
        }else{
            System.out.println(nome+ ": Não incluido no plano");
        }
    }
}
