import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FunctionExample {

    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar a Function como expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero *2;

        //Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n*2)
                .toList();

        numerosDobrados.forEach(System.out::println);
    }

}