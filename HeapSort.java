
// class HeapSort {
//     static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void sort(int arr[]) {
//         int n = arr.length;
//         for (int i = (n / 2) - 1; i >= 0; i--) {
//             heapify(arr, n, i);
//             printArray(arr,n);
//         }
//         for (int i = n - 1; i > 0; i--) {
//             swap(arr, 0, i);
//             heapify(arr, i, 0);
//         }
//     }

//     public static void heapify(int arr[], int n, int i) {
//         int largest = i;
//         int left = 2 * 1 + 1;
//         int right = 2 * i + 2;

//         if (left < n && arr[left] > arr[largest]) {
//             largest = left;
//         }
//         if (right < n && arr[right] > arr[largest]) {
//             largest = right;
//         }
//         if (largest != i) {
//             swap(arr, i, largest);
//             heapify(arr, n, largest);
//         }
//     }

//     static void printArray(int[] arr, int n) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println(" ");
//     }

//     public static void main(String[] args) {
//         int arr[] = new int[] { 100, 64, 34, 25, 12, 22, 11, 90 };
//         int n = arr.length;
//         // HeapSort ob=new HeapSort();
//         HeapSort.sort(arr);
//         System.out.println("Sorted array: ");
//         printArray(arr, n);
//     }
// }

// class HeapSort {
//     static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void sort(int arr[]) {
//         int n = arr.length;
//         for (int i = (n / 2) - 1; i >= 0; i--) {
//             heapify(arr, n, i);

//         }
//         printArray(arr,n);
//         for (int i = 1; i < n; i++) {
//             heapify(arr, n-i-1, i); 
//         }
//     }

//     public static void heapify(int arr[], int n, int i) {
//         int smallest = i;
//         int left = 2 * i + 1;
//         int right = 2 * i + 2;

//         if (left < n && arr[left] < arr[smallest]) {
//             smallest = left;
//         }
//         if (right < n && arr[right] < arr[smallest]) {
//             smallest = right;
//         }
//         if (smallest != i) {
//             swap(arr, i, smallest);
//             heapify(arr, n, smallest);
//         }
//     }

//     static void printArray(int[] arr, int n) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println(" ");
//     }

//     public static void main(String[] args) {
//         int arr[] = new int[] { 100, 64, 34, 25, 12, 22, 11, 90 };
//         int n = arr.length;
//         // HeapSort ob=new HeapSort();
//         HeapSort.sort(arr);
//         System.out.println("Sorted array: ");
//         printArray(arr, n);
//     }
// }

import java.util.*;

public class HeapSort {

    static void heapSort(int[] array) {
        // Create a max heap using PriorityQueue
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int i : array) {
            maxHeap.offer(i);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = maxHeap.poll();
        }
    }

    public static void main(String[] args) {
        int[] array = { 100, 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Original array: " + Arrays.toString(array));

        heapSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
