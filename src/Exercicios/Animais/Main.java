package Exercicios.Animais;

public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        if (c instanceof Cachorro){
            System.out.println((Animal)c);
        }
    }
}
