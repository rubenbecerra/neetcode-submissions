class Solution {
    public int appendCharacters(String s, String t) {
        int left = 0;
        int right = 0;

       while (left < s.length() && right < t.length()) {
            if (s.charAt(left) != t.charAt(right)) {
                left++;
            } else {
                left++;
                right++;
            }
       } 
       return t.length() - right;
    }
}