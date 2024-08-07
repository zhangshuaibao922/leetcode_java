package 字串;

public class subarraySum {
    public static void main(String[] args) {

    }
    public static int subarraySum(int[] nums, int k) {
        int[] preSum=new int[nums.length+1];
        preSum[0]=0;
        for (int i = 0; i < nums.length; i++) {
            preSum[i+1]=preSum[i]+nums[i];
        }
        int count = 0;
        for (int left = 0; left < nums.length; left++) {
            for (int right = left; right < nums.length; right++) {
                if(preSum[right+1]-preSum[left]==k){
                    count++;
                }
            }
        }
        return count;
    }
}
