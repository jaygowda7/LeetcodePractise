class Solution {
    public int maxArea(int[] height) {
        int le=0;
        int ri=height.length-1;
        int ma=0;
        while(le<ri){
            int ar= Math.min(height[le],height[ri])*(ri-le);
            ma=Math.max(ma,ar);
            if(height[le]>height[ri]){
                ri--;
            }else{
                le++;
            }
        }
       return ma; 
    }
}