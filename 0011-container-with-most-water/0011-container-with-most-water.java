class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int ma=0;
        while(i<j){
            int a=Math.min(height[i],height[j])* (j-i);
            ma=Math.max(a,ma);
            if(height[i]>height[j]){
                j--;
            }else{ i++ ;}

        }
        return ma;
    }
}