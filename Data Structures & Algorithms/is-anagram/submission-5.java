class Solution {
    public boolean isAnagram(String s, String t) {
        int[] list = new int[26];
        if (s.equals(t)) {
        return true;
        }
        if (s.length() != t.length()) {
        return false;
        }

        for (int i = 0; i < s.length(); i++) {
            list[s.charAt(i) - 'a']++;
            list[t.charAt(i) - 'a']--;
        }

        for (int num : list) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
