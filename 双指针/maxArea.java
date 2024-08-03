package 双指针;

public class maxArea {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int l=0;
        int r = height.length - 1;
        int max=0;
        while(l<r) {
            int air=Math.min(height[l], height[r])*(r-l);
            max=Math.max(air,max);
            if(height[l]>height[r]){
                --r;
            }else {
                ++l;
            }
        }
        return max;
    }
}
