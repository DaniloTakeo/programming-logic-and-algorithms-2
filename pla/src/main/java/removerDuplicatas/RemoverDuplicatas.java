package removerDuplicatas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoverDuplicatas {

    public static List<Integer> removerDuplicados(List<Integer> lista) {
        Set<Integer> vistos = new HashSet<>();
        List<Integer> resultado = new ArrayList<>();

        for (Integer numero : lista) {
            if (!vistos.contains(numero)) {
                vistos.add(numero);
                resultado.add(numero);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> entrada = Arrays.asList(1, 3, 2, 1, 4, 3, 5);
        List<Integer> resultado = removerDuplicados(entrada);

        System.out.println("Lista original: " + entrada);
        System.out.println("Sem duplicatas: " + resultado);
    }
}