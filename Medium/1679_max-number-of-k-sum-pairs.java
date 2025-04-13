class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int op = 0;

        for (int num : nums) {
            int comp = k - num;
            if (map.getOrDefault(comp, 0) > 0) {
                op++;
                map.put(comp, map.get(comp) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return op;
    }
}