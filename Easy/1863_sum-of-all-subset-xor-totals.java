class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }
    private int dfs(int[] nums, int position, int currentXOR) {
        // base case
        if (position == nums.length) return currentXOR;
        int include = dfs(nums, position + 1, currentXOR ^ nums[position]);
        int exclude = dfs(nums, position + 1, currentXOR);
        return include + exclude;
    }
}

class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int totalSubSets = 1 << n;
        int sumOfXOR = 0;
        for (int i = 0; i < totalSubSets; i++) {
            int currentXOR = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    currentXOR ^= nums[j];
                }
            }
            sumOfXOR += currentXOR;
        }
        return sumOfXOR;
    }
}