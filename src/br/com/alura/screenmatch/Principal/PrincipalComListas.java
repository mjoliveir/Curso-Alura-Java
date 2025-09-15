package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme f1 = new Filme("Harry Potter", 2004);
        f1.avaliar();
        Filme f2 = new Filme("Harry Potter 2", 2005);
        f2.avaliar();
        Serie s1 = new Serie("Potter Harry", 2008);
        s1.avaliar();

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(f1);
        lista.add(f2);
        lista.add(s1);

        for(Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println(((Filme) item).getClassificacao());
            }
        };

    }
}
