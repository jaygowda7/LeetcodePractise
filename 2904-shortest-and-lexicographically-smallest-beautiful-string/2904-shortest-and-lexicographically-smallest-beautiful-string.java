class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        String res = "";

        // Iterate through all possible starting points
        for (int i = 0; i < n; i++) {
            int count = 0;
            // Expand the window to the right
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '1') {
                    count++;
                }
                
                // When we find exactly k ones
                if (count == k) {
                    int currLen = j - i + 1;
                    String currStr = s.substring(i, j + 1);
                    
                    // Update if it's shorter, or lexicographically smaller if lengths match
                    if (currLen < minLen) {
                        minLen = currLen;
                        res = currStr;
                    } else if (currLen == minLen) {
                        if (currStr.compareTo(res) < 0) {
                            res = currStr;
                        }
                    }
                    break; // Shortest possible substring starting at index i
                }
            }
        }
        return res;
    }
}