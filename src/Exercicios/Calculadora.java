package Exercicios;

import java.util.Scanner;

public class Calculadora {
    Scanner reader = new Scanner(System.in);
        double retornaDobro(){
            double numero = reader.nextDouble();
            return  numero * 2;
        }

    public static void main(String[] args) {
            double result = 1;
        Calculadora calc = new Calculadora();
            while(result != 0){
       result = calc.retornaDobro();
        System.out.println(result);
            }
    }
    }

