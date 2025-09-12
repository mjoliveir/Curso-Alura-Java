package br.com.alura.screenmatch.modelos;

import java.util.Scanner;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao = 0;
    private int totalDeAvaliacao = 0;
    private int duracaoEmMinutos;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setTotalDeAvaliacao(int totalDeAvaliacao) {
        this.totalDeAvaliacao = totalDeAvaliacao;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }


    public void exibirFichaTecnica() {
        System.out.println(nome);
        System.out.println(anoDeLancamento);
        System.out.println((incluidoNoPlano) ? "ativo no plano" : "inativo no plano");
        System.out.println(avaliacao);
        System.out.println(totalDeAvaliacao);
    }

    public void avaliar(){
        Scanner reader = new Scanner(System.in);
        this.avaliacao += reader.nextInt();
        this.totalDeAvaliacao++;
    }

    public double getMediaAvaliacoes(){
        return getAvaliacao() / getTotalDeAvaliacao();
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
