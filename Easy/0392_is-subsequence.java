class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index);
            if (index == -1) return false;
            index++;
        }
        return true;
    }
}

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}