package com.main.criando_primeira_aplicacao.Screenmatch;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação do filme");
            nota = leitura.nextDouble();
            if(nota <1 || nota > 10){
                System.out.println(" o valor da nota tem que ser de 1 a 10");
                System.out.println("Digite novamente o valor da sua avaliação");
                nota = leitura.nextDouble();
            }
           media += nota;
        }
        System.out.println(String.format("a média é de: %.2f", media/3));
    }

}
