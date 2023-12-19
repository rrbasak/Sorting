public class Merge {
    static void merge(int arr[],int low,int mid,int high){
        int n1,n2;
        n1=mid-low+1;
        n2=high-mid;
        int a=0,b=0,k=low;
        int left[]=new int[n1];
        int right[]=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        
        while(a<n1 && b<n2){
            if(left[a]<right[b]){
                arr[k]=left[a];
                a++;
            }
            else{
                arr[k]=right[b];
                b++;
            }
            k++;
        }

        while(a<n1){
            arr[k]=left[a];
            a++;
            k++;
        }
        while(b<n2){
            arr[k]=right[b];
            b++;
            k++;
        }
    }
    static void mergesort(int arr[], int low,int high) {
        if(low<high){
            int mid=(low+high)/2;
            mergesort(arr, low, mid);;
            mergesort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }

    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {100, 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        mergesort(arr, 0,n-1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
