package Exercicios.produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("produto 1", 1.90);
        Produto p2 = new Produto("produto 2", 1.80);
        Produto p3 = new Produto("produto 3", 3.90);
        Produto p4 = new Produto("produto 4", 1.70);
        Produto p5 = new Produto("produto 5", 1.90);
        Produto p6 = new Produto("produto 6", 1.00);
        Produto p7 = new Produto("produto 7", 2.00);
        Produto p8 = new Produto("produto 8", 3.00);

        var pc1 = new ProdutoPerecivel("produto 1", 3.00, "18-10-2010");
        var pc2 = new ProdutoPerecivel("produto 2", 3.00, "19-01-2010");
        var pc3 = new ProdutoPerecivel("produto 3", 3.00, "28-11-2010");

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);
        listaDeProdutos.add(pc1);
        listaDeProdutos.add(pc2);
        listaDeProdutos.add(pc3);

        System.out.println(listaDeProdutos);


        //[Produto{nome='produto 1', preco=1.9, quantidade=0},
        // Produto{nome='produto 2', preco=1.8, quantidade=0},
        // Produto{nome='produto 3', preco=3.9, quantidade=0},
        // Produto{nome='produto 1', preco=3.0, quantidade=0},
        // Produto{nome='produto 2', preco=3.0, quantidade=0},
        // Produto{nome='produto 3', preco=3.0, quantidade=0}]
    }


}
