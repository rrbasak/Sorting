public class QuickSort {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i <= end && arr[i] <= pivot) {
                i++;
            }

            while (j >= start && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, start, j);
        return j;
    }

    static void quicksort(int arr[], int start, int end) {
        if (start < end) {
            int k = partition(arr, start, end);
            quicksort(arr, start, k - 1);
            quicksort(arr, k + 1, end);
        }
    }

    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 100, 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        quicksort(arr, 0, n-1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
