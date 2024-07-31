import java.util.*;

public class longestConsecutive {
    public static void main(String[] args) {

    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            hashSet.add(i);
        }
        int Max=0;
        int result=0;
        for(int num : nums) {
            if(!hashSet.contains(num-1)) {
                Max=1;
                while (hashSet.contains(num+1)){
                    Max++;
                    num++;
                }
                result=Math.max(result,Max);
            }
        }
        return result;
    }
}
