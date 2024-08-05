package 滑动窗口;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {

    }
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap();
        //定义一个滑动窗口
        int l=0;
        //结果
        int result=0;
        //直到r走到尽头
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))&& (map.get(s.charAt(i))>=l)){
                l=map.get(s.charAt(i))+1;
            }
            map.put(s.charAt(i),i);
            result=Math.max(result,i-l+1);
        }
        return result;
    }
}
