package Exercicios;

import java.util.Scanner;

public class CoversorDeMoedas implements ConversaoFinanceira{
    Scanner reader = new Scanner(System.in);
    private double valorEmDolar;

    public double getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(double valorEmDolar) {
            this.valorEmDolar = valorEmDolar;
        }

        @Override
        public void converterDolarParaReal(double dolar) {
            System.out.printf("Bem vindo ao conversor de dolar para real.%n" +
                    "==========================================%n" +
                    "Digiite o valor a ser convertido:");
            setValorEmDolar(reader.nextDouble());
        ConversaoFinanceira.super.converterDolarParaReal(getValorEmDolar());
    }

    public static void main(String[] args) {
        CoversorDeMoedas conversor = new CoversorDeMoedas();
        while(true){
            conversor.converterDolarParaReal(1);
        }
    }
}

