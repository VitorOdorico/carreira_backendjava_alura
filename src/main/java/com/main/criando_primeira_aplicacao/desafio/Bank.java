package com.main.criando_primeira_aplicacao.desafio;

import java.text.SimpleDateFormat;
import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Vitor";
        String tipoDeConta = "ContaCorrente";
        double saldo = 10.0;
        Date dataAtual = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(dataAtual);
        List<String> extrato = new ArrayList<>();

        System.out.println("*************** Bem vindo ao bank-alura ***************");
        System.out.println(String.format("Cliente: %s  \nData de acesso: %s \nSaldo atual: %.2f",
                nome, dataFormatada, saldo ));

        while (true) {

            System.out.println("""
                    
                    ==== MENU ====
                    1 - pedir empréstimo
                    2 - pagar com PIX
                    3 - verificar extrato
                    4 - verificar saldo atual
                    5 - sair
                    """);

            System.out.print("Escolha uma opção: ");
            String opcao = leitura.nextLine();

            switch (opcao) {

                case "1":
                    System.out.println("Digite o valor desejado do empréstimo:");
                    double valor = leitura.nextDouble();
                    leitura.nextLine(); // limpa buffer

                    double valorComJuros = CalculaEmprestimo(valor);
                    saldo += valorComJuros;

                    extrato.add("Empréstimo: +" + String.format("%.2f", valorComJuros));

                    System.out.println("Saldo atual: " + saldo);
                    break;

                case "2":
                    System.out.println("Qual valor deseja pagar com PIX?");
                    valor = leitura.nextDouble();
                    leitura.nextLine(); // limpa buffer

                    saldo -= valor;

                    extrato.add("PIX enviado: -" + String.format("%.2f", valor));

                    System.out.println("Saldo atual: " + saldo);
                    break;

                case "3":
                    System.out.println("======= EXTRATO =======");
                    if (extrato.isEmpty()) {
                        System.out.println("Nenhuma movimentação registrada.");
                    } else {
                        for (String linha : extrato) {
                            System.out.println(linha);
                        }
                    }
                    break;
                case "4":
                    System.out.println("saldo atual: " + saldo);
                    break;
                case "5":
                    System.out.println("Encerrando o sistema...");
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public static double CalculaEmprestimo(double valor) {
        double valorComJuros = valor * 1.02;
        System.out.println("Valor com juros aplicado: " + valorComJuros);
        return valorComJuros;
    }
}
