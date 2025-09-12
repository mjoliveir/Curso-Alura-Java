package br.com.alura.screenmatch.modelos;

public class MainFIlme {
    public static void main(String[] args) {
        Filme meufilme = new Filme();
//        meufilme.nome = "Harry Potter";
//        meufilme.anoDeLancamento= 1980;
//        meufilme.incluidoNoPlano = true;
//        meufilme.avaliacoes = 8.1;
//        meufilme.totalDeAvaliacao = 1000;
        meufilme.setNome("Harry Potter");
        meufilme.setAnoDeLancamento(1980);
        meufilme.setIncluidoNoPlano(true);
        meufilme.exibirFichaTecnica();

        while(true) {
            meufilme.avaliar();
            meufilme.getMedia();
        }
    }

}
