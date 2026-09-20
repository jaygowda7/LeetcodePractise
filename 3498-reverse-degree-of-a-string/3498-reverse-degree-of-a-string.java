class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int pro=1;
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            int rev=26-index;
            pro=(i+1)*rev;
            sum+=pro;
        }
        return sum;
    }
}