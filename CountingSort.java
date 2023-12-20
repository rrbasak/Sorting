class CountingSort {
    static int maxi(int arr[], int n) {
        int maz = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > maz)
                maz = i;
        }
        return maz;
    }

    static void countingsort(int arr[], int n) {
        int size = maxi(arr, n);
        int count[] = new int[size + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

   
        for (int i = 1; i <= size; i++) {
            count[i] = count[i - 1] + count[i];
        }

        int[] outputArray = new int[n];
 
        for (int i = n - 1; i >= 0; i--) {
            outputArray[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for(int i=0;i<n;i++){
            arr[i]=outputArray[i];
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

        System.out.println("Original array: ");
        printArray(arr, n);

        countingsort(arr, n);

        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
