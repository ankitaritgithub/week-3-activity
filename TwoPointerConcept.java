public class TwoPointerConcept {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 35, 50, 75, 80 };
        int x = 95;
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == x) {
                System.out.println("Found " + x + " as sun of values on index: " + l + " and indes " + r);
                return;
            } else if (sum < x) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println("Sum not found.");
    }
}
