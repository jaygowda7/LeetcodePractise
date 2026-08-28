class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int i=0;
        for(int j=0;j<nums.length;j++){
            int com=target-nums[j];
            if(map.containsKey(com)){
                return new int[] {map.get(com),i};
            }
            map.put(nums[i],i);
            i++;
        }
        return new int[] {};
    }
}