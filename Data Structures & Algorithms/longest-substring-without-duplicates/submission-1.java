class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> list = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            if (list.contains(s.charAt(right))) {
                while (list.contains(s.charAt(right))){
                    list.remove(s.charAt(left));
                    left++;
                }
            } 
            list.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
