package Exercicios;

public interface ConversaoFinanceira {
     default void converterDolarParaReal(double dolar){
         System.out.println(dolar * 6);
    }
}
