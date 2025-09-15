package Exercicios.produto;

public class ProdutoPerecivel extends Produto {
    private String dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, String dataDeValidade) {
        super(nome, preco);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "Nome: " + getNome() + ", " +
                "Preço: " + getPreco() + ", "
                + "dataDeValidade='" + dataDeValidade + '\'' +
                '}';
    }
}
