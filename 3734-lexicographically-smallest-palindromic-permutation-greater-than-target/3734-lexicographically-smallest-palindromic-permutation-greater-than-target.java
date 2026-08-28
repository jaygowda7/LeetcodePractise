import java.util.Arrays;

class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();
        int[] totalCount = new int[26];
        for (char c : s.toCharArray()) {
            totalCount[c - 'a']++;
        }

        // Check if a palindrome is possible (at most one odd character count)
        int oddCount = 0;
        char midChar = '#';
        int[] leftCount = new int[26];

        for (int i = 0; i < 26; i++) {
            if (totalCount[i] % 2 != 0) {
                oddCount++;
                midChar = (char) ('a' + i);
            }
            leftCount[i] = totalCount[i] / 2; // Inventory for the left half
        }

        if (oddCount > 1) {
            return ""; 
        }

        int halfLen = n / 2;
        char[] leftHalf = new char[halfLen];
        int matchIdx = 0;

        // Step 1: Try to match target's left half as much as possible
        while (matchIdx < halfLen) {
            char tChar = target.charAt(matchIdx);
            if (leftCount[tChar - 'a'] > 0) {
                leftHalf[matchIdx] = tChar;
                leftCount[tChar - 'a']--;
                matchIdx++;
            } else {
                break;
            }
        }

        // Step 2: Backtrack from maximum match position to find a pivot point
        for (int i = matchIdx; i >= 0; i--) {
            if (i < matchIdx) {
                leftCount[leftHalf[i] - 'a']++; // Return character back to pool
            }

            // Case A: Perfect match of the left half. 
            // Check if the naturally formed full palindrome is strictly greater than target.
            if (i == halfLen) {
                String candidate = buildPalindrome(leftHalf, midChar, n);
                if (candidate.compareTo(target) > 0) {
                    return candidate;
                }
                continue; // Mirror failed to be greater, must backtrack to find a larger pivot
            }

            // Case B: Find the smallest character strictly greater than target.charAt(i)
            char tChar = target.charAt(i);
            for (int c = (tChar - 'a') + 1; c < 26; c++) {
                if (leftCount[c] > 0) {
                    leftHalf[i] = (char) ('a' + c);
                    leftCount[c]--;

                    // Fill remaining slots of left half with smallest available sorted characters
                    int p = i + 1;
                    for (int j = 0; j < 26; j++) {
                        while (leftCount[j] > 0) {
                            leftHalf[p++] = (char) ('a' + j);
                            leftCount[j]--;
                        }
                    }
                    return buildPalindrome(leftHalf, midChar, n);
                }
            }
        }

        return "";
    }

    // Helper method to mirror the left half and form the complete palindrome string
    private String buildPalindrome(char[] leftHalf, char midChar, int n) {
        char[] full = new char[n];
        int halfLen = leftHalf.length;
        
        // Copy left half
        System.arraycopy(leftHalf, 0, full, 0, halfLen);
        
        // Place middle character if length is odd
        if (n % 2 != 0) {
            full[halfLen] = midChar;
        }
        
        // Mirror to the right half
        for (int i = 0; i < halfLen; i++) {
            full[n - 1 - i] = leftHalf[i];
        }
        
        return new String(full);
    }
}