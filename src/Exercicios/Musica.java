import java.util.Scanner;

public class Musica {
    String artista;
    int anoDeLancamento;
    double avaliacao = 0;
    double numeroDeAvaliacoes = 0;


    void exibirFichaTecnica(){
        System.out.println(artista);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
        System.out.println(numeroDeAvaliacoes);
    }

    void avaliarMusica(){
        Scanner reader = new Scanner(System.in);
        avaliacao += reader.nextDouble();
        numeroDeAvaliacoes++;
    }

    double retornaMediaAvaliacoes(){
     double media = avaliacao / numeroDeAvaliacoes;
        return media;
    }

    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.artista = "harry potter";
        musica1.anoDeLancamento = 2025;
        musica1.exibirFichaTecnica();
        while(musica1.numeroDeAvaliacoes != 10){
            musica1.avaliarMusica();
            musica1.exibirFichaTecnica();
            double resultado = musica1.retornaMediaAvaliacoes();
            System.out.println(resultado);
        }


    }

}
