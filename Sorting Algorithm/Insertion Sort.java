package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public void insertionSort(int [] nums){
        for(int i=1; i<nums.length; i++){
            int item = nums[i];
            int j=i-1;
            while(j>=0 && nums[j] > item){
                nums[j+1] = nums[j];
                j=j-1;
            }
            nums[j+1]=item;
        }
    }
    public static void main(String[] args) {
        int [] nums = {5,2,3,1,4};
        InsertionSort cal = new InsertionSort();
        cal.insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
