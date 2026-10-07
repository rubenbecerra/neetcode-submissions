class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (char c : strs[0].toCharArray()) {
            for (String s : strs) {
                if (index >= s.length()) {
                    return sb.toString();
                }
                if (s.charAt(index) != c) {
                    return sb.toString();
                }
            }
            index++;
            sb.append(c);
        }
        return sb.toString();
    }
}