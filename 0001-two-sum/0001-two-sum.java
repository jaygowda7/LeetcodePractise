class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int l=0;

        for(int r=0;r<nums.length;r++){
            int com=target-nums[r];
            if(m.containsKey(com)){
                return new int[] {m.get(com),l};
            }
            m.put(nums[l],l);
            l++;
        }
        return new int[] {};
    }
}