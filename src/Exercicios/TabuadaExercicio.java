package Exercicios;

import java.util.Scanner;

public class TabuadaExercicio {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        for (int i = 0 ; i <= 10 ; i++){
            int value = i * number;
            System.out.printf("%d X %d = %d%n", i, number, value);
        }
    }
}
