package countSubstringsWithSumK;

public class CountSubstringsWithSumK {
    public static int countSubstringsWithSumK(String s, int k) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += s.charAt(j) - '0';
                if (sum == k) {
                    count++;
                } else if (sum > k) {
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "123123";
        int k = 6;
        int result = countSubstringsWithSumK(s, k);
        System.out.println("Número de substrings com soma " + k + ": " + result);
    }
}