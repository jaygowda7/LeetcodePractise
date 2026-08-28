class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        
        int i=0;
        for(int j=s.length()-1;j>i;j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
        }
        return true;
    }
}