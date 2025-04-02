class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxValue = 0;
        for (int candy : candies) {
            if (candy > maxValue) {
                maxValue = candy;
            }
        }
        for(int candy : candies){
            result.add(candy + extraCandies >= maxValue);
        }
        return result;
    }
}