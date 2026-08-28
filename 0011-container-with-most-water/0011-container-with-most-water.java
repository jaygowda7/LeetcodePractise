class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int max=0;
        int j=height.length-1;

        while(j>i){
            int ma=(j-i)*Math.min(height[i],height[j]);

            max=Math.max(max,ma);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}