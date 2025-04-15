package mergeSortedLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedLists {

    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        // Percorre ambas as listas e intercala os menores elementos
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i++));
            } else {
                result.add(list2.get(j++));
            }
        }

        // Adiciona os elementos restantes da primeira lista (se houver)
        while (i < list1.size()) {
            result.add(list1.get(i++));
        }

        // Adiciona os elementos restantes da segunda lista (se houver)
        while (j < list2.size()) {
            result.add(list2.get(j++));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6);

        List<Integer> merged = merge(list1, list2);
        System.out.println("Lista intercalada: " + merged);
    }
}