package Exercicios;

public class Condicional {
    public static void main(String[] args) {
        int anoDelancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDelancamento >= 2022){
            System.out.println("Lançamneot que os clientes estão gostando");
        } else System.out.println("FIlme retrô que vale a pena assistir");

        if (incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else System.out.println("É necessário a locação desse filme");
    }
}
