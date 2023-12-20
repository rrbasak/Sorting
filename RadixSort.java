public class RadixSort {
    static int maxi(int arr[], int n) {
        int maz = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > maz)
                maz = i;
        }
        return maz;
    }
    static void radixsort(int arr[],int n){
        int size = maxi(arr, n);
        for(int pos=1;size/pos>0;pos=pos*10){
            countingsort(arr, n,pos);
        }

    }
    static void countingsort(int arr[], int n,int pos) {
       
        int count[] = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i]/pos)%10]++;
        }

   
        for (int i = 1; i <= 9; i++) {
            count[i] = count[i - 1] + count[i];
        }

        int[] outputArray = new int[n];
 
        for (int i = n - 1; i >= 0; i--) {
            outputArray[count[(arr[i]/pos)%10] - 1] = arr[i];
            count[(arr[i]/pos)%10]--;
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
        printArray(arr, n);
        radixsort(arr,n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
