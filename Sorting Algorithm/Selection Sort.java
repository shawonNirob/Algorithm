package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public void selectionSort(int [] nums){
        for(int i=0; i< nums.length; i++){
            int indexMin=i;
            for(int j=i+1; j< nums.length; j++) {
                if (nums[indexMin] > nums[j]) {
                    indexMin = j;
                }
            }
            if (indexMin !=i){
                int temp = nums[i];
                nums[i] = nums[indexMin];
                nums[indexMin] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] nums = {10,5,2,8,7};
        SelectionSort cal = new SelectionSort();
        cal.selectionSort(nums);
        System.out.println("Selection Sort: ");
        System.out.println(Arrays.toString(nums));
        }
    }
