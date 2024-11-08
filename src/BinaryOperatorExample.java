import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample
{

    public static void main(String[] args) {

        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // usar o BinaryOperator com expressão lambda para somar dois númeors inteiros
        BinaryOperator<Integer> somar = Integer::sum;

        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("A soma dos números é: " + resultado);
    }

}
