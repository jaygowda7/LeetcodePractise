class Solution {
    public int trap(int[] height) {
        int water=0;
        int le=0;
        int ri=height.length-1;
        int lemax=height[0];
        int rimax=height[ri];
        while(le<ri){
            if(lemax<rimax){
                le++;
                lemax=Math.max(lemax,height[le]);
                water+=lemax-height[le];
            }else{
                ri--;
                rimax=Math.max(rimax,height[ri]);
                water+=rimax-height[ri];
            }
        }
        return water;
    }
}