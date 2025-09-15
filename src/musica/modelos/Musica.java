package musica.modelos;

public class Musica extends Audio{
    private String album;
    private String Cantor;
    private String Genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return Cantor;
    }

    public void setCantor(String cantor) {
        Cantor = cantor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(getTotCurtidas() >= 600){
            return 10;
        }else return 5;
    }
}
