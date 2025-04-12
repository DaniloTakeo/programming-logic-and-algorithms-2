package anagramChecker;

import java.util.Arrays;

public class AnagramCheck {
    public static boolean areAnagrams(String s1, String s2) {
        // Remove espaços e converte para minúsculas
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Se os tamanhos forem diferentes, não podem ser anagramas
        if (s1.length() != s2.length()) return false;

        // Converte as strings em arrays de caracteres e ordena
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compara os arrays ordenados
        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (areAnagrams(s1, s2)) {
            System.out.println("São anagramas");
        } else {
            System.out.println("Não são anagramas");
        }
    }
}