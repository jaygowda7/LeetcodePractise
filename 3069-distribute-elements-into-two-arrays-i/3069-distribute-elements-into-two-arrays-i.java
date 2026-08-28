class Solution {
    public int[] resultArray(int[] nums) {
         int n=nums.length;
         List<Integer> n1=new ArrayList<>();
         List<Integer> n2=new ArrayList<>();
         n1.add(nums[0]);
         n2.add(nums[1]);
         for(int i=2;i<n;i++){
            int x=n1.get(n1.size()-1);
            int y=n2.get(n2.size()-1);

            if(x>y){
                n1.add(nums[i]);
            }else{
                n2.add(nums[i]);
            }
         }
         int []res=new int[n];
         int id=0;
         for(int x:n1) res[id++]=x;
         for(int y:n2) res[id++]=y;
         return res;
    }
    
}