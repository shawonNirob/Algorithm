package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public void sortBubble(int [] nums) {
        for(int i=0; i< nums.length; i++){
            for (int j=0; j< nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {8,2,4,1,5};
        BubbleSort cal = new BubbleSort();
        cal.sortBubble(nums);
        System.out.println(Arrays.toString(nums));
    }
}
