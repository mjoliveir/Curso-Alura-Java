package musica.modelos;

public class Audio {
    private String titulo;
    private int totReproducoes;
    private int totCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void curtir(){
    totCurtidas++;
    }

    public void reproduzir(){
        totReproducoes++;
    }

    public int getTotReproducoes() {
        return totReproducoes;
    }

    public int getTotCurtidas() {
        return totCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
