package 滑动窗口;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findAnagrams {
    public static void main(String[] args) {


    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> integers = new ArrayList<>();
        HashMap<Character, Integer> win = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            need.put(p.charAt(i),need.getOrDefault(p.charAt(i),0)+1);
        }
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            win.put(s.charAt(i),win.getOrDefault(s.charAt(i),0)+1);
            // 如果当前窗口包含了字符串 p 的所有字符及其对应的数量
            if (win.equals(need)) {
                integers.add(start);
            }

            if(i>=p.length()-1){
                if(win.get(s.charAt(start))==1){
                    win.remove(s.charAt(start));
                }else {
                    win.replace(s.charAt(start),win.get(s.charAt(start)),win.get(s.charAt(start))-1);
                }
                start++;
            }
        }
        return integers;
    }
}
