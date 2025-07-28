import java.util.Arrays;

/**
 * @author : Leonardo Siagian
 * @date : 7/28/2025
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {9, 4, 2, 4, 1, 43, 65, 9, 3};
        System.out.println("Initial Array : " + Arrays.toString(arr));
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
