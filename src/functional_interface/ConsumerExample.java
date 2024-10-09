package src.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
 *  Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 *  É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream
 *  sem modificar, ou retornar um valor.
 *
 *
 */
public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

    }
}
