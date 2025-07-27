import java.util.Arrays;

/**
 * @author : Leonardo Siagian
 * @date : 7/26/2025
 */
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {9, 4, 2, 4, 1, 43, 65, 9, 3};
        System.out.println("Initial Array : " + Arrays.toString(arr));
        MergeSort mergeSort = new MergeSort();
        int sortedArr[] = mergeSort.mergeSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(sortedArr));
    }

    public int[] mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        int[] leftArr = mergeSort(left);
        int[] rightArr = mergeSort(right);
        return merge(leftArr, rightArr);
    }

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
