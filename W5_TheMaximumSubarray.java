import java.util.*;

public class Solution {

    // Maximum subarray sum - Kadane's Algorithm
    public static int maxSubarraySum(int[] arr) {
        int current = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }

        return max;
    }

    // Maximum non-empty subsequence sum
    public static int maxSubsequenceSum(int[] arr) {
        int sum = 0;
        int maxElement = arr[0];

        for (int num : arr) {
            maxElement = Math.max(maxElement, num);

            if (num > 0) {
                sum += num;
            }
        }

        // If all numbers are negative, choose the largest one
        if (sum == 0) {
            return maxElement;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int subarray = maxSubarraySum(arr);
            int subsequence = maxSubsequenceSum(arr);

            System.out.println(subarray + " " + subsequence);
        }

        sc.close();
    }
}
