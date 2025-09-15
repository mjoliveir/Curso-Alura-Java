package Exercicios.temperatura;

import java.util.Scanner;

public class ConversorTemperaturaPadrao  implements ConversorTemperatura{
    Scanner reader = new Scanner(System.in);
    @Override
    public void celsiusParaFr() {
        double numero = reader.nextDouble();
        double fr = numero * 1.8 + 32;
        System.out.println(fr);
    }

    @Override
    public void frParaCelsius() {
        double numero = reader.nextDouble();
        double cs = (numero - 32) / 1.8;
        System.out.println(cs);
    }

    public static void main(String[] args) {
        ConversorTemperaturaPadrao c = new ConversorTemperaturaPadrao();
        c.celsiusParaFr();
    }
}
