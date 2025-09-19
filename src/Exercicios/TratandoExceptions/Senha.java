package Exercicios.TratandoExceptions;

import Exercicios.TratandoExceptions.excecoes.SenhaInvalidaException;

public class Senha {
    private String valor;
    public Senha(String valor) {
        this.valor = valor;
        if(this.valor.length() < 8){
            throw new SenhaInvalidaException("A senha deve conter ao menos 8 caracteres");
        }
    }

}
