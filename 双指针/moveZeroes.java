package 双指针;

import java.util.*;

public class moveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {
        int left=0,right=0;
        for(;right<nums.length;right++){
            int  tmp;
            if(nums[right]!=0){
                tmp=nums[right];
                nums[right]=nums[left];
                nums[left]=tmp;
                left++;
            }
        }
        System.out.println(nums.length);
//        int exchange;
//        for (int i = 0,j=0; i < nums.length; i++) {
//            if(nums[i]!=0){
//                exchange=nums[i];
//                nums[i] =nums[j];
//                nums[j] = exchange;
//                j++;
//            }
//        }
//        int left=0,right=0;
//        while (right<nums.length-1){
//            while (nums[left]==0&&nums[right]!=0){
//                right++;
//            }
//            int tmp=nums[left];
//            nums[left]=nums[right];
//            nums[right]=tmp;
//        }
    }
}
