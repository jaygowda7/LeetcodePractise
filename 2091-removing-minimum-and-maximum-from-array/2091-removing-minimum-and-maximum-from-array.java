class Solution {
    public int minimumDeletions(int[] nums) {
        int minind=0;
        int maxind=0;
        int n=nums.length;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[minind]){
                minind=i;
            }
            if(nums[i]>nums[maxind]){
                maxind=i;
            }
        }

        int left=Math.min(minind,maxind);
        int right=Math.max(minind,maxind);

        int fromFront=right+1;
        int fromBack=n-left;
        int fromBoth=(left+1)+(n-right);

        return Math.min(fromFront,Math.min(fromBack,fromBoth));
    }
}