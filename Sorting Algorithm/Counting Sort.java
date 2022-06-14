package sortingAlgorithms;

public class CountingSort {
    public void countingSort(int[] arr, int size){
        int output[] = new int[size];
        int max=0;
        for(int i=0; i<size; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count[]= new int[max+1];
        for(int i=0; i<=max; i++){
            count[i]=0;
        }
        for(int i=0; i<size; i++){
            count[arr[i]] += 1;
        }
        int sum = 0;
        for(int i=0; i<=max; i++){
            sum = count[i] + sum;
            count[i] = sum;
        }
        for(int i=0; i<size; i++){
            int var = arr[i];
            count[var]--;
            output[count[var]] = var;
        }
        for(int i=0; i<size; i++){
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,4,4,7,7,3,0,0,3,3,1};
        int size = arr.length;
        System.out.println(size);

        CountingSort call = new CountingSort();
        call.countingSort(arr, size);

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
