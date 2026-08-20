class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int le=0,sum=0;
        int min =Integer.MAX_VALUE;

        for(int ri=0;ri<nums.length;ri++){
            sum +=nums[ri];

            while(sum>=target){

                min=Math.min(min,ri-le+1);
                sum-=nums[le];
                le++;

            }
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}