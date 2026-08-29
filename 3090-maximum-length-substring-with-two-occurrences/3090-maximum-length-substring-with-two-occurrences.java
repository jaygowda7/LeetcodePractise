class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,res=0;
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>2){
                char le=s.charAt(i);
                map.put(le,map.get(le)-1);
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;       
    }
}