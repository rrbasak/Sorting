class SelectionSort{
    static void selectionsorrt(int arr[],int n){
        int min,temp;
        for(int i=0;i<n-1;i++){
            min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
        selectionsorrt(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}