public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacoes;
    int totalDeAvaliacao;


    void exibirFichaTecnica(){
        System.out.println(nome);
        System.out.println(anoDeLancamento);
        System.out.println((incluidoNoPlano)? "ativo no plano" : "inativo no plano");
        System.out.println(avaliacoes);
        System.out.println(totalDeAvaliacao);
    }
}

