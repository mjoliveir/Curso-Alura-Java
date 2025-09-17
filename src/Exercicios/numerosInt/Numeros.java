package Exercicios.numerosInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Numeros implements Comparable<Numeros>{
    private int numero;
    Numeros(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {}

    @Override
    public int compareTo(Numeros numeros) {
        return Integer.compare(numeros.numero, this.numero);
    }

    @Override
    public String toString() {
        return "\n" + numero;
    }
/*Crie uma lista de números inteiros e utilize o
     método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.*/

    public static void main(String[] args) {
        List<Numeros> numeros = new ArrayList<>();
        numeros.add(new Numeros(1));
        numeros.add(new Numeros(3));
        numeros.add(new Numeros(6));
        numeros.add(new Numeros(1));
        numeros.add(new Numeros(2));
        numeros.add(new Numeros(9));
        numeros.add(new Numeros(0));
        numeros.add(new Numeros(3));
        numeros.add(new Numeros(4));
        numeros.add(new Numeros(5));
        numeros.add(new Numeros(7));
        numeros.add(new Numeros(0));
        numeros.add(new Numeros(9));
        numeros.add(new Numeros(8));

        System.out.println(numeros);

//        Collections.sort(numeros);
//
//        System.out.println(numeros);

        Collections.sort(numeros);

        System.out.println(numeros);


    }
}
