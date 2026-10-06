class Solution {
    public int appendCharacters(String s, String t) {
        int left = 0;
        int right = 0;
        int count = 0;

        while ( left < t.length() && right < s.length()) {
            if (t.charAt(left) == s.charAt(right)) {
                left++;
            }
            right++;
        }
        return (t.length() - left);
    }
}