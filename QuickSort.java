import java.util.Arrays;

/**
 * @author : Leonardo Siagian
 * @date : 7/26/2025
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = SortUtil.generateRandomArray(1000);
        System.out.println("Initial Array : " + Arrays.toString(arr));
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partial(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public int partial(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left ; j < right ; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;

        return i;
    }
}
