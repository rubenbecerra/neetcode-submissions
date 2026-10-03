class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0,new ArrayList<>(), result);
        return result;
    }

    public void backtrack(String s, int start, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList(current));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            String sub = s.substring(start,end + 1);
            if (isPalindrome(sub, 0, sub.length()- 1)) {
                current.add(sub);
                backtrack(s, end + 1, current, result);
                current.remove(current.size() - 1);
            }
            

        }
    }

    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
