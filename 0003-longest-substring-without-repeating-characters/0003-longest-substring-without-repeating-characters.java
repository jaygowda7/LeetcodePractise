class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] ind=new int[128];
        Arrays.fill(ind,-1);
        int i=0,ml=0;
        for(int j=0;j<s.length();j++){
            char curr=s.charAt(j);
            if(ind[curr]>=i){
                i=ind[curr]+1;
            }
            ind[curr]=j;
            ml=Math.max(ml,j-i+1);
        }
        return ml;
    }
}