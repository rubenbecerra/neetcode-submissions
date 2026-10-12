class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while ( left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            char first = s.charAt(left);
            char second = s.charAt(right);

            char firstS = Character.toLowerCase(first);
            char secondS = Character.toLowerCase(second);

            if (firstS != secondS) {
                return false;
            }
            left++;
            right--;

            
        }
        return true;
    }
}
