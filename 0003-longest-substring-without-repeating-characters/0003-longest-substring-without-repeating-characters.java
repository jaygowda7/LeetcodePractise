class Solution {
    public int lengthOfLongestSubstring(String s) {
      int []indices=new int[128];
      Arrays.fill(indices,-1);
      int i=0;
      int ml=0;
      for(int j=0;j<s.length();j++){
        char c=s.charAt(j);
        if(indices[c]>=i){
            i=indices[c]+1;
        }
        indices[c]=j;
        ml=Math.max(ml,j-i+1);
      }
      return ml;
    }
}