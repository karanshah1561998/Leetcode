class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !vowels.contains(chars[left])) left++;
            while (left < right && !vowels.contains(chars[right])) right--;

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}

class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        List<Character> vowelList = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                vowelList.add(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        int j = vowelList.size() - 1;

        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                result.append(vowelList.get(j--));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}