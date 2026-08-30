class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=0,max=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        int le=Math.min(min,max);
        int ri=Math.max(min,max);

        int front=ri+1;
        int back=n-le;
        int both=(le+1)+(n-ri);
        return Math.min(front,Math.min(back,both));
    }
}