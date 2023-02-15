public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 10, 11, 4, 1 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}
