class ShellSort{
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void shellsort(int arr[],int n){
        for(int gap=n/2;gap>=1;gap=gap/2){
            for(int j=gap;j<n;j++){
                for(int i=j-gap;i>=0;i=i-gap){
                    if(arr[i+gap]>arr[i]){
                        break;
                    }
                    else{
                        swap(arr,i+gap,i);
                    }
                }
            }
        }
    }
    static void printArray(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        int arr[] =new int[]{64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        
        printArray(arr, n);
        shellsort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}