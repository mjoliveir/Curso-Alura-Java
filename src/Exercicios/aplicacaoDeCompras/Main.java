package Exercicios.aplicacaoDeCompras;

import java.lang.reflect.Array;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 1;
        ArrayList listaDeCompras = new ArrayList();


        while(opcao != 0){
            System.out.println("BEM VINDO, DIGITE O LIMITE DO SEU CARTÃO:");
            Scanner input = new Scanner(System.in);
            int limite = input.nextInt();
            input.nextLine();
            if (opcao == 1){
                do {
                    System.out.println("DIGITE 1 PARA CADASTRAR COMPRAS E 0 PARA SAIR");
                    opcao = input.nextInt();
                    if (opcao == 0){
                        System.out.println(listaDeCompras);
                        break;
                    }
                    System.out.println(opcao);
                    System.out.println("Digite o nome do produto:");
                    String descricao = input.nextLine();
                    input.nextLine();
                    System.out.println("Digite o valor do produto:");
                    Double preco = input.nextDouble();
                    input.nextLine();
                    System.out.println("Seu produto foi comprado com sucesso!!!!!!!!");
                    listaDeCompras.add("Comprou: " + descricao + " por: " + preco);
                    limite -= preco;
                    System.out.println("Parabens, voce comprou: " + descricao + " no valor de " + "R$:" + preco);
                    System.out.println("Seu limite é de: " + limite);
                } while(opcao != 0);
                    }
            }

        }
    }
