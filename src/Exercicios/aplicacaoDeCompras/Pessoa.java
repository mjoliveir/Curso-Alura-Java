package Exercicios.aplicacaoDeCompras;

public class Pessoa {
    private String nome;
    private double limite;
    private double saldo;

    public Pessoa(String nome, double limite) {
        this.nome = nome;
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
