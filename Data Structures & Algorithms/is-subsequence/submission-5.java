class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;
        if (t.isEmpty()) {
            return false;
        } else if (s.isEmpty()) {
            return true;
        }

        while (left < s.length() && right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
            }
            right++;
        }
        return left == s.length();
    }
}