class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        
        // Step 1: Create a sorted copy of the numbers
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        
        // Map each number to its corresponding group ID
        Map<Integer, Integer> numToGroup = new HashMap<>();
        // Map group ID to a queue of elements belonging to that group
        Map<Integer, LinkedList<Integer>> groupToList = new HashMap<>();
        
        int groupID = 0;
        numToGroup.put(sortedNums[0], groupID);
        groupToList.put(groupID, new LinkedList<>());
        groupToList.get(groupID).add(sortedNums[0]);
        
        // Step 2: Divide sorted numbers into groups based on the limit
        for (int i = 1; i < n; i++) {
            if (sortedNums[i] - sortedNums[i - 1] > limit) {
                groupID++; // Start a new group if the gap exceeds limit
            }
            numToGroup.put(sortedNums[i], groupID);
            if (!groupToList.containsKey(groupID)) {
                groupToList.put(groupID, new LinkedList<>());
            }
            groupToList.get(groupID).add(sortedNums[i]);
        }
        
        // Step 3: Reconstruct the answer array
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int originalNum = nums[i];
            int gid = numToGroup.get(originalNum);
            // Poll the smallest element remaining in this group
            result[i] = groupToList.get(gid).pollFirst();
        }
        
        return result;
    }
}