import java.util.ArrayList;

public class MaxSumSubArray {
    public static int max_sum_of_subarray(int arr[], int n, int k) {
        int max_sum = 0;
        for (int i = 0; i + k <= n; i++) {
            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += arr[j];
            }
            if (temp > max_sum)
                max_sum = temp;
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        // by brute force
        int max_sum = max_sum_of_subarray(arr, n, k);
        System.out.println(max_sum);
    }
}
