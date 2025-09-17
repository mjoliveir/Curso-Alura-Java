package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme f1 = new Filme("a", 2004);
        Filme f2 = new Filme("c", 2005);
        Serie s1 = new Serie("d", 2008);
        Filme f3 = new Filme("r", 2004);
        Filme f4 = new Filme("t", 2005);
        Serie s5 = new Serie("z", 2008);
        Filme f6 = new Filme("b", 2004);
        Filme f7 = new Filme("e", 2005);
        Serie s0 = new Serie("x", 2008);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(f1);
        lista.add(f2);
        lista.add(s1);
        lista.add(f3);
        lista.add(f4);
        lista.add(s5);
        lista.add(s0);
        lista.add(f6);
        lista.add(f7);

        System.out.printf("antes da ordenação: %s\n" +
                "=======================================\n", lista);
        Collections.sort(lista);
        System.out.printf("Depois da ordenaçao (Ordem alfabetica): %s\n" +
                "========================================\n", lista);
        lista.sort(Comparator.comparing(Titulo :: getAnoDeLancamento));
        System.out.printf("Depois da ordenaçãp (Ordem cronológica): %s\n", lista);


//        for(Titulo item: lista){
//            System.out.println(item.getNome());
//            if (item instanceof Filme filme){
//                System.out.println(((Filme) item).getClassificacao());
//            }
//        };

//        ArrayList<String> buscaPorArtista = new  ArrayList<>();
//        buscaPorArtista.add("A");
//        buscaPorArtista.add("C");
//        buscaPorArtista.add("B");
//        buscaPorArtista.add("F");
//        buscaPorArtista.add("D");
//        buscaPorArtista.add("Y");
//        buscaPorArtista.add("Z");
//
//        System.out.printf("antes da sort: %s%n",buscaPorArtista);
//        Collections.sort(buscaPorArtista);
//        System.out.printf("Depois do sort: %s%n", buscaPorArtista);
//

    }
}
