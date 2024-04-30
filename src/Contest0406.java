package src;

import java.util.ArrayList;
import java.util.List;

public class Contest0406 {
    public static int longestMonotonicSubarray(int[] nums) {

        int len = nums.length;
        int left = 1;
        int right = 1;
        int max = 1;
        for(int i = 0; i < len-1; i++){
            int m = i;
            int j = m + 1;
            left = 1;
            while(nums[m] < nums[j]){
                left++;
                m++;
                j++;
                if(j > len-1){
                    break;
                }
            }
             m = i;
             j = m + 1;
             right = 1;
            while(nums[m] > nums[j]){
                right++;
                m++;
                j++;
                if(j > len-1){
                    break;
                }
            }
            max = Math.max(max,Math.max(left,right));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1,4,3,3,2};
        int[] array2 = {3,2,1};
        System.out.println(longestMonotonicSubarray(array));
        System.out.println(longestMonotonicSubarray(array2));
    }
}
