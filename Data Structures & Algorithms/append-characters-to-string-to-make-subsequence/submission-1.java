class Solution {
    public int appendCharacters(String s, String t) {
        int left = 0;
        int right = 0;

        while (left < t.length() && right < s.length()) {
            if (s.charAt(right) == t.charAt(left)) {
                left++;
            }
            right++;
        }
        return t.length() - left;
    }
}