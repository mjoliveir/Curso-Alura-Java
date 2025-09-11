import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Bem vindo ao Comparando Numeros. Digite dois numeros para comparar");
        int number1 = reader.nextInt();
        int number2 = reader.nextInt();
        if (number1 == number2){
            System.out.println("Comparação bem sucedida");
            System.out.println("Os números são iguais");
        }
        if (number1 > number2){
            System.out.println("O primeiro valor digitado é maior que o segundo");
        } else if (number1 < number2 )System.out.println("O primeiro valor digitado é menor que o segundo");

    }
}
