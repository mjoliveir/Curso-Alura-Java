package br.com.alura.screenmatch.Principal;
import br.com.alura.screenmatch.calculo.Calculadora;
import br.com.alura.screenmatch.calculo.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meufilme = new Filme("nome", 1980);
        meufilme.setIncluidoNoPlano(true);
        meufilme.setDuracaoEmMinutos(180);


        Filme meufilme2 = new Filme("Harry Potter", 1989);
        meufilme2.setIncluidoNoPlano(true);
        meufilme2.setDuracaoEmMinutos(180);

        Serie serie = new Serie("Harry Potter", 2002);
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
//        serie.avaliar();
        System.out.println(serie.getMediaAvaliacoes());
        filtro.filtra(serie);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meufilme);
        listaDeFilmes.add(meufilme2);

        System.out.println(listaDeFilmes);



    }

}
