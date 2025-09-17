package Exercicios.TitulosESort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    Titulo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.nome.compareTo(titulo.nome);
    }

    @Override
    public String toString() {
        return "\nNome: " + this.nome;
    }

    public static void main(String[] args) {
        List listaDeTitulos = new LinkedList();
        listaDeTitulos.add(new Titulo("MARIA"));
        listaDeTitulos.add(new Titulo("MARIO"));
        listaDeTitulos.add(new Titulo("ANTONIO"));
        listaDeTitulos.add(new Titulo("JULIANO"));
        listaDeTitulos.add(new Titulo("SILVA"));
        listaDeTitulos.add(new Titulo("CARLOS"));
        listaDeTitulos.add(new Titulo("BRUNO"));
        listaDeTitulos.add(new Titulo("ALICE"));
        listaDeTitulos.add(new Titulo("DANILO"));
        listaDeTitulos.add(new Titulo("EVANDRO"));
        listaDeTitulos.add(new Titulo("INES"));
        listaDeTitulos.add(new Titulo("JOSE"));

        Collections.sort(listaDeTitulos);

        System.out.println(listaDeTitulos);

    }

}
