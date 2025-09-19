package Exercicios.PraticandoGson;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Pessoa {
    @SerializedName("Nome")
    private String nome;
    @SerializedName("Idade")
    private String idade;
    @SerializedName("Cidade")
    private String cidade;

    public String getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public Pessoa(String nome, String idade, String cidade) {}


    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Cidade: " + cidade;
    }

    public static void main(String[] args) {

        String jsonPessoa = """
                {
                "Nome": "Matheus",
                "Cidade": "São Paulo"
                }""";
        Gson gson = new Gson();
        Pessoa p1 = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println(p1);




    }
}
