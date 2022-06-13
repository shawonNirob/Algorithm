package sortingAlgorithms;

public class QuickSort {
    private int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i+=1;

                int var = arr[j];
                arr[j] = arr[i];
                arr[i] = var;
            }
        }
        int var = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = var;

        return i+1;
    }
    public void quickSort(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int p = partition(arr, low, high);

        quickSort(arr,low, p-1);
        quickSort(arr,p+1, high);
    }

    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        int n = arr.length-1;

        QuickSort call = new QuickSort();
        call.quickSort(arr, 0, n);

        for(int i=0; i<=n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
