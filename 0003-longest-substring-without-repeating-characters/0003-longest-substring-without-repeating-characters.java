class Solution {
    public int lengthOfLongestSubstring(String s) {
        int []indices=new int[128];
        Arrays.fill(indices,-1);

        int ml=0,i=0;
        for(int j=0;j<s.length();j++){
            char curr=s.charAt(j);
            if(indices[curr]>=i){
                i=indices[curr]+1;
            }
            indices[curr]=j;
            ml=Math.max(ml,j-i+1);
        }
        return ml;
    }
}