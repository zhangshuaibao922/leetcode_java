package 哈希;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{3,2,4}, 6);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //containsKey，判断key存不存在
            if(map.containsKey(target-nums[i])){
                //按照从0到length-1，所以小的一定会存到map里边，大的在外边判断
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i],i);
        }
        return null;

    }

}