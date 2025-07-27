import java.util.Arrays;

/**
 * @author : Leonardo Siagian
 * @date : 7/26/2025
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {9, 4, 2, 4, 1, 43, 65, 9, 3};
        System.out.println("Initial Array : " + Arrays.toString(arr));
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    public void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int j = arr.length - 1;
        while (j > 1) {
            boolean noSwap = true;
            for (int i = 0 ; i < j ; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    noSwap = false;
                }
            }
            if (noSwap) break;
            j--;
        }
    }
}
