package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.selfException.ErroDeTempoDeDuração;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        var reader = new Scanner(System.in);
        System.out.println("Oque vamos assistir??");
        var search = "";

        List<Titulo> listaDeTitulos = new ArrayList<>();

        while (!search.equals("sair")) {
            search = reader.nextLine();
            if (search.equals("sair")) {

                break;
            }
            var addres = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=f9f9b0b6";
            FileWriter file = null;
            Gson gson = null;
            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(addres))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                System.out.println(response.body());
                String json = response.body();
                gson = new GsonBuilder().setPrettyPrinting()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

                TituloOMDB exemplo = gson.fromJson(json, TituloOMDB.class);
                System.out.println(addres);
                System.out.printf("Antes:%n %s %n", exemplo);

                file = new FileWriter("Flmes.json");


                var title = new Titulo(exemplo);
                listaDeTitulos.add(title);
                System.out.println("Depois");
                System.out.println(title);


            } catch (NumberFormatException error) {
                System.out.println("Deu erro paizao: " + error.getMessage());
            } catch (IllegalArgumentException error) {
                System.out.println("Digitou errado doidao kkkkkk");
            } catch (ErroDeTempoDeDuração error) {
                System.out.println("Deu não paizão, erro no json dos cara");

            }
            file.write(gson.toJson(listaDeTitulos));
            file.close();

        }
    }
}
