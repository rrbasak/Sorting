class InsertionSort{
    static void insertionsort(int arr[],int n){
        int temp,j=0;
        for(int i=1;i<n;i++){
            temp = arr[i];
            for(j=i-1;j>=0 && arr[j]>temp;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
    }
    static void printArray(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        int arr[] =new int[]{100, 64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        insertionsort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}