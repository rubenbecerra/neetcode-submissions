class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] countS1 = new int[26];
        int[] countS2 = new int[26];
        int left = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            countS1[s1.charAt(i) - 'a']++;
            countS2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(countS1,countS2)) {
            return true;
        }
        for (int right = s1.length(); right < s2.length(); right++) {
            countS2[s2.charAt(right) - 'a']++;
            countS2[s2.charAt(left) - 'a']--;
            left++;

            if (Arrays.equals(countS1, countS2)) {
                return true;
            }
        }
        return false;
    }
}
