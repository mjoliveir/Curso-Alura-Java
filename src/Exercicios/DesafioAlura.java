package Exercicios;

import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String accountType = "Corrente";
        double balance = 0;
        int option = 0;

        System.out.printf("BEM VINDO AO BANCO ALURA%n" +
                "-----------------------%n" +
                "TIPO DE CONTA: %s%n" +
                "SALDO INICIAL: RS:%2f%n" +
                "----------------------%n", accountType, balance);

        while (option != 4) {
            System.out.printf(
                    "SELECIONE A OPÇÃO DESEJADA%n" +
                    "1- CONSULTAR SALDO%n" +
                    "2-RECEBER VALOR%n" +
                    "3-TRANSFERIR VALOR%n" +
                    "4-SAIR%n");
            option = reader.nextInt();
            switch (option){
                case 1:
                    System.out.printf("Seu saldo é de %f%n%n%n%n", balance);
                    break;
                case 2:
                    System.out.println("Qual o valor a ser recebido?");
                    double valorRecebido =  reader.nextDouble();
                    balance += valorRecebido;
                    System.out.printf("Seu saldo foi atualizado%n%n%n%n");
                    break;
                case 3:
                    System.out.println("Qual o valor a ser trasnferido?");
                    double valorTransferido = reader.nextDouble();
                    if (valorTransferido > balance){
                        System.out.printf("Não é possível fazer essa transferencia, saldo abaixo do esperado.%n%n%n%n");
                    } else {
                        balance += -valorTransferido;
                        System.out.printf("Transferencia realizada com sucesso%n" +
                                "Seu novo saldo é de %f%n%n%n%n", balance);
                    }
                    break;
            }
        }
    }
}
