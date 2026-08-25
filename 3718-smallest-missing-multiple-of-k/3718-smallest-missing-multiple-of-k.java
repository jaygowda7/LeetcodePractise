class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        int mul=k;
        while(seen.contains(mul)){
            mul+=k;
        }
        return mul;
    }
}