package Exercicios.TratandoExceptions;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TesteAPIGithub 
    
{
    public static void main (String[]args) throws IOException, InterruptedException {


        var reader = new Scanner(System.in);
        var nomeDeUsuario = reader.nextLine();
        var address =
                "https://api.github.com/users/" + nomeDeUsuario;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            var resposta = response.body();

            Gson gson = new Gson();
            var p = gson.fromJson(resposta, GithubAccount.class);
            GithubAccountFull conta = new GithubAccountFull(p);
            conta.print();
        }catch (IllegalArgumentException e){
            System.out.println("Erro ao tentar obter o login, escreva o nome de usuario corretamente!");
        }
    }
}
