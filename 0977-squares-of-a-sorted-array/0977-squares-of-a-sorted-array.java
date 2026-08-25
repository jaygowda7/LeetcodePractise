class Solution {
    public int[] sortedSquares(int[] nums) {
        int le=0;
        int ri=nums.length-1;
        int []res=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int sq1=nums[le]*nums[le];
            int sq2=nums[ri]*nums[ri];
            if(sq1>sq2){
                res[i]=sq1;
                le++;
            }else{
                res[i]=sq2;
                ri--;
            }
        }
        return res;
    }
}