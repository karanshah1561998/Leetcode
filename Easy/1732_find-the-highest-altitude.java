class Solution {
    public int largestAltitude(int[] gain) {
        int m = 0;
        int c = 0;
        for (int g : gain) {
            c += g;
            m = Math.max(m, c);
        }
        return m;
    }
}