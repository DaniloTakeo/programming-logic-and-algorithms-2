package contadorInversoes;

public class ContadorInversoes {

    public static int contarInversoes(int[] array) {
        if (array == null || array.length == 0) return 0;
        return mergeSortContar(array, 0, array.length - 1);
    }

    private static int mergeSortContar(int[] array, int esquerda, int direita) {
        if (esquerda >= direita) return 0;

        int meio = esquerda + (direita - esquerda) / 2;
        int contagem = 0;

        contagem += mergeSortContar(array, esquerda, meio);
        contagem += mergeSortContar(array, meio + 1, direita);
        contagem += merge(array, esquerda, meio, direita);

        return contagem;
    }

    private static int merge(int[] array, int esquerda, int meio, int direita) {
        int[] esquerdaArr = new int[meio - esquerda + 1];
        int[] direitaArr = new int[direita - meio];

        for (int i = 0; i < esquerdaArr.length; i++) {
            esquerdaArr[i] = array[esquerda + i];
        }
        for (int i = 0; i < direitaArr.length; i++) {
            direitaArr[i] = array[meio + 1 + i];
        }

        int i = 0, j = 0, k = esquerda, inversoes = 0;

        while (i < esquerdaArr.length && j < direitaArr.length) {
            if (esquerdaArr[i] <= direitaArr[j]) {
                array[k++] = esquerdaArr[i++];
            } else {
                array[k++] = direitaArr[j++];
                inversoes += (esquerdaArr.length - i); // todos os elementos restantes em esquerdaArr são maiores
            }
        }

        while (i < esquerdaArr.length) {
            array[k++] = esquerdaArr[i++];
        }

        while (j < direitaArr.length) {
            array[k++] = direitaArr[j++];
        }

        return inversoes;
    }

    // Exemplo de uso
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 3, 5};
        int resultado = contarInversoes(array);
        System.out.println("Número de inversões: " + resultado); // Saída esperada: 3
    }
}