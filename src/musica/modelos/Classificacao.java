package musica.modelos;

public class Classificacao {
    public void inclui(Audio audio){
        if (audio.getClassificacao() <= 5){
            System.out.printf("Vale a pena dar uma olhada em %s%n", audio.getTitulo());
        }else System.out.printf("%s com certeza merece sua atenção%n", audio.getTitulo());
    }
}
