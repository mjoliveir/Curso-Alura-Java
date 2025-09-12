package Exercicios;

public class IdadePessoa {
    /*Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para
     acessar e modificar esses atributos. Adicione um
     método verificarIdade que imprime se a pessoa é maior de idade ou não.*/

    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void verificarIdade(){
        int idade = getIdade();
        if(idade >= 18){
            System.out.println("Maior de idade");
        } else System.out.println("Menor de idade");
    }

    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setIdade(19);
        pessoa1.verificarIdade();
        pessoa1.setIdade(12);
        pessoa1.verificarIdade();
    }
}
