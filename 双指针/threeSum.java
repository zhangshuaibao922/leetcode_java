package 双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                return res;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1,right=nums.length-1;
            while (left<right){
                if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                }else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left] == nums[left + 1]) left++;
                    right--;
                    left++;
                }
            }
        }
        return null;
    }
}
