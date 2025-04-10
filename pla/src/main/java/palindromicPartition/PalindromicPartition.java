package palindromicPartition;

public class PalindromicPartition {

    public static int minCut(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];
        int[] cuts = new int[n];

        for (int end = 0; end < n; end++) {
            int minCuts = end;
            for (int start = 0; start <= end; start++) {
                if (s.charAt(start) == s.charAt(end) &&
                        (end - start <= 2 || isPalindrome[start + 1][end - 1])) {
                    isPalindrome[start][end] = true;
                    minCuts = start == 0 ? 0 : Math.min(minCuts, cuts[start - 1] + 1);
                }
            }
            cuts[end] = minCuts;
        }

        return cuts[n - 1];
    }

    public static void main(String[] args) {
        String s = "aab";
        int resultado = minCut(s);
        System.out.println("Mínimo de cortes necessários: " + resultado);
    }
}