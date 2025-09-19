package Exercicios.ViaCep;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestApi {
    private String cep;

    public RequestApi(String  cep){
        setCep(cep);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    void requestAPI() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + getCep() + "/json/"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        var query = response.body();

        Gson gson = new Gson();
        var cepArquivo = gson.newBuilder().setPrettyPrinting().create().toJson(query);
        FileWriter file = new FileWriter("cep.json");
        file.write(cepArquivo);
        file.close();

    }
}

