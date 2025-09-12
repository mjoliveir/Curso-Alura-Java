import br.com.alura.screenmatch.calculo.Calculadora;
import br.com.alura.screenmatch.calculo.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meufilme = new Filme();
        meufilme.setNome("Harry Potter");
        meufilme.setAnoDeLancamento(1980);
        meufilme.setIncluidoNoPlano(true);
        meufilme.setDuracaoEmMinutos(180);


        Filme meufilme2 = new Filme();
        meufilme2.setNome("Harry Totter");
        meufilme2.setAnoDeLancamento(1989);
        meufilme2.setIncluidoNoPlano(true);
        meufilme2.setDuracaoEmMinutos(180);

        Serie serie = new Serie();
        serie.setNome("Harry Totter");
        serie.setAnoDeLancamento(1989);
        serie.setIncluidoNoPlano(true);
        serie.setEpisodiosPorTemporada(10);
        serie.setTemporada(10);
        serie.setMinutosPorTemporada(10);

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(serie);
        calculadora.inclui(meufilme);

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        System.out.println(serie.getMediaAvaliacoes());
        filtro.filtra(serie);
        serie.avaliar();
        System.out.println(serie.getMediaAvaliacoes());
        filtro.filtra(serie);



    }

}
