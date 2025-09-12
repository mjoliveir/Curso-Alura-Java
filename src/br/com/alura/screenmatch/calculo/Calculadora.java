package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class Calculadora {
    private int duracaoTotal;

    public void inclui(Titulo titulo){
        duracaoTotal += titulo.getDuracaoEmMinutos();
        System.out.println(duracaoTotal);
    }
}
