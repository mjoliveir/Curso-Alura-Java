package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo implements Classificavel{
    private int temporada;
    private boolean ativo;
    private int episodiosPorTemporada;
    private int minutosPorTemporada;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorTemporada() {
        return minutosPorTemporada;
    }

    public void setMinutosPorTemporada(int minutosPorTemporada) {
        this.minutosPorTemporada = minutosPorTemporada;
    }

    @Override public int getDuracaoEmMinutos(){
        return getMinutosPorTemporada() * getTemporada();
    }

    @Override
    public int getClassificacao() {
       return (int) getMediaAvaliacoes() /2;

        }
}

