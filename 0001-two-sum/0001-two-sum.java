class Solution {
    public int[] twoSum(int[] nums, int target) {
       
      HashMap<Integer,Integer> maps = new HashMap<>();

      for (int i=0;i<nums.length;i++){

        int c=target-nums[i];

        if(maps.containsKey(c)){
            return new int[] {maps.get(c),i};
        }
        maps.put(nums[i],i);
      }
      return new int[] {};
    }
}