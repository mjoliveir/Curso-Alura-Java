package Exercicios.ViaCep;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        var input = new Scanner(System.in);
        var request = new RequestApi("05814200");
        request.requestAPI();
    }
}
