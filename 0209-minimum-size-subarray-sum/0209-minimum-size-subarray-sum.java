class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int sum=0;
        int mi=Integer.MAX_VALUE;

        for(int j=0;j<nums.length;j++){
            sum+=nums[j];

            while(sum>=target){
                mi=Math.min(mi,j-i+1);
                sum-=nums[i];
                i++;
            }
        }
        return (mi==Integer.MAX_VALUE)?0:mi;
    }
}