class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> maps = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int compliment = target-nums[i];

            if(maps.containsKey(compliment)){
                return new int[] {maps.get(compliment),i};
            }
            maps.put(nums[i],i);
        }

        return new int[] {};
    }
}