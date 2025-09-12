import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int i = 0;

        while (i < 3){
            System.out.println("Digite sua avaliação para o filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            i++;
        }
        System.out.println("Media das avaliações: " + mediaAvaliacao/3);
    }
}
