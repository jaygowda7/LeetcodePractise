class Solution {
    public int trap(int[] height) {
        int le=0;
        int ri=height.length-1;
        int leftmax=height[0];
        int rightmax=height[ri];
        int water=0;
        while(le<ri){
            if(leftmax<rightmax){
                le++;
                leftmax=Math.max(leftmax,height[le]);
                water+=leftmax-height[le];
            }else{
                ri--;
                rightmax=Math.max(rightmax,height[ri]);
                water+=rightmax-height[ri];
            }
        }
        return water;
    }
}