package Exercicios.aplicacaoDeCompras;

public class Produtos {
    private String nome;
    private double preco;
    private static int contador = 0;
    private int id;


    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.id = contador++;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "\nnome: " + nome + ", preco: " + preco + " id: " + id;
    }
}