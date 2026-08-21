class Solution {
    public int[] sortedSquares(int[] nums) {
        int []ans=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int l=nums.length-1;l>=0;l--){
            int s1=nums[i]*nums[i];
            int s2=nums[j]*nums[j];

            if(s1>s2){
                ans[l]=s1;
                i++;
            }else{
                ans[l]=s2;
                j--;
            }
        }
        return ans;
    }
}