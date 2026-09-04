class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int n=nums.length;
       int[] suf=new int[n];
       int min=Integer.MIN_VALUE;

       for(int i=n-1;i>=0;i--){
        min=Math.min(min,nums[i]);
        suf[i]=min;
       }
       int max=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            int score=max-suf[i];
            if(score<=k){
                return i;
            }
       }
       return -1;
    }
}