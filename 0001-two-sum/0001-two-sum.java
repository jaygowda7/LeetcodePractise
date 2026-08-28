class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int j=0;j<nums.length;j++){
            int com=target-nums[j];
            if(map.containsKey(com)){
                return new int[] {map.get(com),j};
            }else{
                map.put(nums[j],j);
 
            }
            
        }
        return new int[] {};
    }
}