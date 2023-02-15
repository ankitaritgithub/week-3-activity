package Recursion;

public class BinarySearchWithoutRecursion {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72 };
        int x = 16;
        // x=10;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                System.out.println("Value found at index: " + mid);
                return;
            } else if (x < arr[mid]) {
                r = mid - 1;
            } else {
                r = mid + 1;
            }
        }
        System.out.println("Value not found");
    }
}
