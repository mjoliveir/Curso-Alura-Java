import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um numero qualquer:");
        int numero = reader.nextInt();
        if (numero >= 0){
            System.out.println("O numero " + numero + " é positivo");
        } else System.out.println("O numero " + numero + " é negativo");
    }
}
