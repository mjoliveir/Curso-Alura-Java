package Exercicios.arraylist;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        var p1 = new Pessoa("matheus", 20);
        var p2 = new Pessoa("Arthur", 20 );
        var p3 = new Pessoa("Giovanna", 20);
        var p4 = new Pessoa("Danny", 20);
        var p5 = new Pessoa("Leonardo", 20);
        var p6 = new Pessoa("Raphael", 20);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);
        listaDePessoas.add(p4);
        listaDePessoas.add(p5);
        listaDePessoas.add(p6);

        System.out.println(listaDePessoas);


    }
}
