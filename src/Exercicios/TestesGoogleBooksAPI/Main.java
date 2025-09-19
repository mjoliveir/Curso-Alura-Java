package Exercicios.TestesGoogleBooksAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        var reader = new Scanner(System.in);
        var search  = reader.nextLine();
        var API_KEY = "AIzaSyAlg5u3gybHIPl3ubUnqMFLgBTaVHDMYtI";
        var address = "https://www.googleapis.com/books/v1/volumes?q="+ search +"+inauthor:keyes&key=" +  API_KEY;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        System.out.println(address);
    }
}
