class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.length() == 0) {
            return false;
        } else if (s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = 0;

        while (left < s.length() && right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
            }
            right++;
        }
        return left == s.length();
    }
}