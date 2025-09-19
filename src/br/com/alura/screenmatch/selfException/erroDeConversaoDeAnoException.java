package br.com.alura.screenmatch.selfException;

public class erroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public erroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
