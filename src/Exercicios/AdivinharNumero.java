import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        System.out.println("Digite um valor entre 0 e 100");

        for (int i = 0 ; i <= 5 ; i++) {
            int numeroUsuario = reader.nextInt(); //leitura da tentativa do usuario
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Você acertou o numero, parabéns!!!");
                break;
            } else if (numeroAleatorio > numeroUsuario){
                System.out.println("Você errou o numero :(. Tente novamente, seu numero é MENOR1 que o esperado");
            } else System.out.println("Você errou o numero :(. Tente novamente, seu numero é MAIOR que o esperado");
            if (i == 5){
                System.out.println("Você é pessimo!!!, o numero era " + numeroAleatorio);
            }
        }
    }
}
