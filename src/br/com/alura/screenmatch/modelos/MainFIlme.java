public class MainFIlme {
    public static void main(String[] args) {
        Filme meufilme = new Filme();
        meufilme.nome = "Harry Potter";
        meufilme.anoDeLancamento= 1980;
        meufilme.incluidoNoPlano = true;
        meufilme.avaliacoes = 8.1;
        meufilme.totalDeAvaliacao = 1000;

        meufilme.exibirFichaTecnica();
    }
}
