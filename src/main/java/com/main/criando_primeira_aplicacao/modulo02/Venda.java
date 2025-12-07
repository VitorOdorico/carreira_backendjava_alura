package com.main.criando_primeira_aplicacao.modulo02;

public class Venda {
    public static void main(String[] args) {
        double precoProduto = 200.0;
        int quantidadeDeVendas = 10;
        double valorTotal = precoProduto * quantidadeDeVendas;
        System.out.println(String.format("O valor total é de %.2f", valorTotal));

    }
}
