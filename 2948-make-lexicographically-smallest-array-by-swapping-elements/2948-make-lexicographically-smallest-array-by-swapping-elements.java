class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] res = new int[n];
        int[][] arr = new int[n][2];
        for(int i=0; i<n; ++i) {
            arr[i][0] = i;
            arr[i][1] = nums[i];
        }
        Arrays.sort(arr, (a,b) -> Integer.compare(a[1],b[1]));
        int l=0, r=0;
        while (l<n) {
            List<Integer> indices = new ArrayList<>();
            indices.add(arr[l][0]);
            while (r+1<n && arr[r+1][1] - arr[r][1] <= limit) {
                r++;
                indices.add(arr[r][0]);
            }
            int idx = 0;
            Collections.sort(indices);
            for(int k=l; k<=r; ++k) {
                res[indices.get(idx++)] = arr[k][1];
            }
            l = ++r;
        }
        return res;
    }
}