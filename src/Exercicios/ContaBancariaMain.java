package Exercicios;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroConta("123");
        conta1.setTitular("Matheus Jesus");
        conta1.setSaldo(2);

        conta1.exibirInfoConta();
    }
}
