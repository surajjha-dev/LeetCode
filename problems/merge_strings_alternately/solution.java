class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1 = 0, p2 = 0;
        StringBuilder str = new StringBuilder();

        while (p1 < word1.length() || p2 < word2.length()) {
            if (p1 < word1.length())
              str.append(word1.charAt(p1++));
            if (p2 < word2.length())
              str.append(word2.charAt(p2++));
        }

        return str.toString();
    }
}