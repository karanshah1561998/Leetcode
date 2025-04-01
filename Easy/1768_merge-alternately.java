class Solution {
    public String mergeAlternately(String word1, String word2) {
        if (word1.isEmpty()) return word2;
        if (word2.isEmpty()) return word1;

        int m = word1.length(), n = word2.length();
        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();

        while (i < m && j < n) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        if(i < m) result.append(word1.substring(i));
        if(j < n) result.append(word2.substring(j));

        return result.toString();
    }
}