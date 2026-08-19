class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n=nums.length;        
        int [] ans =new int[n];

        int l=0;
        int r=nums.length-1;
        for(int i=n-1;i>=0;i--){
            int left=nums[l]*nums[l];
            int right=nums[r]*nums[r];
            if(left>right){
                ans[i]=left;
                l++;
            }else{
                ans[i]=right;
                r--;
            }
        }
        return ans;
    }
}