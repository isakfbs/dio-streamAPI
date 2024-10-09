package src.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 * */
public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Cria uma predicate que verifica se a palavra tem mais de  caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream().filter(p -> p.length() > 5)
                .forEach(System.out::println);


    }
}
