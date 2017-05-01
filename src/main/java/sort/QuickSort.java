package sort;

/**
 * Created by panther on 17-4-23.
 */
public class QuickSort {
    public static void main(String[] args) {
        int a[] = {4, 7, 5, 2, 8, 5};
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }


    public static void quickSort(int a[], int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];


        while (end > start) {
            while (end > start && a[end] >= key) {
                end--;
            }

            if (end > start && a[end] < key) {
                a[end] = a[start] ^ a[end];
                a[start] = a[end] ^ a[start];
                a[end] = a[start] ^ a[end];
            }

            while (end > start && a[start] <= key) {
                start++;
            }

            if (end > start && a[start] >= key) {
                a[end] = a[start] ^ a[end];
                a[start] = a[end] ^ a[start];
                a[end] = a[start] ^ a[end];
            }
        }

        if (start > low) {
            quickSort(a, low, start - 1);
        }
        if (end < high) {
            quickSort(a, end + 1, high);
        }
    }
}
