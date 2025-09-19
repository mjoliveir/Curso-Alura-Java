package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.Principal.TituloOMDB;
import br.com.alura.screenmatch.selfException.erroDeConversaoDeAnoException;
import br.com.alura.screenmatch.selfException.ErroDeTempoDeDuração;
import com.google.gson.annotations.SerializedName;

import java.util.Scanner;

public class Titulo implements  Comparable<Titulo>{
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;

    public Titulo(TituloOMDB meuTituloOMDB) {
        this.nome = meuTituloOMDB.title();
        if (meuTituloOMDB.year().length() > 4){
        throw new erroDeConversaoDeAnoException("Não foi possível converter o ano informado, ele está incorreto");
        }
        this.anoDeLancamento = Integer.parseInt(meuTituloOMDB.year());
        if (meuTituloOMDB.runtime().equalsIgnoreCase("N/A")){
            this.duracaoEmMinutos = 0;
        } else if (meuTituloOMDB.runtime().length() == 6) {
            this.duracaoEmMinutos = Integer.valueOf(meuTituloOMDB.runtime().substring(0, 2));
        } else if (meuTituloOMDB.runtime().length() == 7){
            this.duracaoEmMinutos = Integer.valueOf(meuTituloOMDB.runtime().substring(0, 3));

        }

    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.getNome().compareTo(titulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo: " + getNome() + "\n" +
                "Ano de lancaçmento: " + getAnoDeLancamento() + "\n" +
                "Duração em minutos: " +  getDuracaoEmMinutos() + "Minutos\n";
    }

    @SerializedName("imdbRating")
    private double avaliacao = 0;
    @SerializedName("imdbVotes")
    private int totalDeAvaliacao = 0;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

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
