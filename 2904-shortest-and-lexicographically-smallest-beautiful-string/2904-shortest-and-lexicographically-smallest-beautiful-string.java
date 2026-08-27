class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int min=Integer.MAX_VALUE;
        String res = "";
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(s.charAt(j)=='1'){
                    count++;
                }
                if(count==k){
                    int curlen=j-i+1;
                    String curstr=s.substring(i,j+1);
                    if(curlen<min){
                        res=curstr;
                        min=curlen;
                    }else if(curlen==min){
                        if(curstr.compareTo(res)<0){
                            res=curstr;
                        }
                    }
                    break;
                }
                
            }
        }
        return res;
    }
}