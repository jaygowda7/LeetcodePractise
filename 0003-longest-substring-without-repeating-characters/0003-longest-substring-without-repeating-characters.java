class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] indexes = new int[128];
       Arrays.fill(indexes, -1);
       int left = 0;
       int maxLength = 0;

       for (int right = 0; right < s.length(); right++) {
        char currentChar = s.charAt(right);
        if (indexes[currentChar] >= left) {
            left = indexes[currentChar] + 1;
        }

        indexes[currentChar] = right;
        maxLength = Math.max(maxLength, right - left + 1);
       }
       return maxLength;
    }
}