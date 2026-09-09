import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            int n = s.length();
            int[] freqLeft = new int[26];
            int[] freqRight = new int[26];

            // First half
            for (int i = 0; i < n / 2; i++) {
                freqLeft[s.charAt(i) - 'a']++;
            }

            // Second half
            // For odd length, skip the middle character
            int start = (n + 1) / 2;

            for (int i = start; i < n; i++) {
                freqRight[s.charAt(i) - 'a']++;
            }

            if (Arrays.equals(freqLeft, freqRight)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
