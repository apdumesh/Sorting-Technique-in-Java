import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = { 6, 0, 9, 1, 3, 7, 2 };

        for (int i = 0; i < arr.length; i++) {
            int currItem = arr[i];
            int j = i - 1;
            while (j >= 0 && currItem < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currItem;
        }
        // for (int i = 0; i < arr.length; i++)
        // System.out.print(arr[i] + " ");
        // System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
