package Exercicios;

public class ContaBancaria {
    /*Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico)
    . Implemente métodos getters e setters para os atributos privados.*/

    private String numeroConta;
    private double saldo = 0;
    private String titular;

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void exibirInfoConta(){
        System.out.println(getNumeroConta());
        System.out.println(getSaldo());
        System.out.println(getTitular());
    }
}
