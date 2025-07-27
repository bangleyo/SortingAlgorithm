/**
 * @author : Leonardo Siagian
 * @date : 7/27/2025
 */
public class SortUtil {
    public static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1e6);
        }

        return arr;
    }
}
