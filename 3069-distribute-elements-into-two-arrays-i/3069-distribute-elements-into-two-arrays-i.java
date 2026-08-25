class Solution {
    public int[] resultArray(int[] nums) {

        int n=nums.length;
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<n;i++){
            int num1=arr1.get(arr1.size()-1);
            int num2=arr2.get(arr2.size()-1);

            if(num1>num2) arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }
        int []res=new int[n];
        int id=0;
        for(int x:arr1) res[id++]=x;
        for(int y:arr2) res[id++]=y;
        
        return res;
    }
}