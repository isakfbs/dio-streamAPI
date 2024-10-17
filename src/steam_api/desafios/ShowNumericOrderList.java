package src.steam_api.desafios;

import java.util.Arrays;
import java.util.List;

public class ShowNumericOrderList {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    //Crie um programa que utilize a Stream API para ordenar a lista de números em
    // ordem crescente e a exiba no console.
        numeros.stream().sorted().forEach(System.out::println);
        System.out.println();

    // Utilizando a Stream API, realize a soma dos números pares da lista e exiba
    // o resultado no console.
        System.out.println(numeros.stream().filter(n -> n%2==0).reduce(0, Integer::sum));
        System.out.println();


    }
}
