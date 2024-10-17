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

    //Com a ajuda da Stream API, verifique se todos os números da lista são
    // positivos e exiba o resultado no console.
        System.out.println(numeros.stream().allMatch(n -> n>0));
        System.out.println();

    //Utilize a Stream API para remover os valores ímpares da lista
    // e imprima a lista resultante no console.
        numeros.stream().filter(n -> n%2==0).forEach(System.out::println);
        System.out.println();

    //Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
        System.out.println(""+ numeros.stream().filter(n -> n > 5).mapToDouble(n -> n).average());
        System.out.println();
    //Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
        System.out.println(numeros.stream().anyMatch(n -> n > 10));
        System.out.println();
    }
}
