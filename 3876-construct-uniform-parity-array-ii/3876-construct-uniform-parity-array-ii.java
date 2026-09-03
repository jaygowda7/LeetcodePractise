class Solution {
    public boolean uniformArray(int[] nums1) {

        int min=nums1[0];
        int oddC=0;
        for(int i:nums1){
            min=Math.min(min,i);
            if(i%2!=0) oddC++;
        }
        return (min%2!=0) || (oddC==0);
        
    }
}