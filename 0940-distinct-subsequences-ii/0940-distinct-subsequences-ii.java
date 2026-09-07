class Solution {

    public int distinctSubseqII(String s) {

        final long MOD = 1_000_000_007;

        long[] last = new long[26];

        long dp = 1; // empty subsequence

        for (char c : s.toCharArray()) {

            int index = c - 'a';

            long previousDp = dp;

            dp = (2 * dp - last[index] + MOD) % MOD;

            last[index] = previousDp;
        }

        // Remove empty subsequence
        return (int) ((dp - 1 + MOD) % MOD);
    }
}