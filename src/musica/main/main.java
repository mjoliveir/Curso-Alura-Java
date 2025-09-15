package musica.main;

import musica.modelos.Audio;
import musica.modelos.Classificacao;
import musica.modelos.Musica;
import musica.modelos.Podacat;


public class main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("IDK");
        minhaMusica.setAlbum("album doidao");
        minhaMusica.setCantor("cantor doidao");

        Podacat meuPodcast = new Podacat();
        meuPodcast.setTitulo("Podcast doidao");


        for (int i = 0; i <= 1000; i++) {
           meuPodcast.reproduzir();
        }

        for (int i = 0; i <= 500; i++) {
            minhaMusica.curtir();
        }

        Classificacao classificar = new Classificacao();
        classificar.inclui(minhaMusica);
        classificar.inclui(meuPodcast);

    }
}
