class Solution {
    public String customSortString(String order, String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : order.toCharArray()) {
            int index = c - 'a';
            while (count[index] > 0) {
                sb.append(c);
                count[index]--;
            }
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sb.append((char) (i + 'a'));
                count[i]--;
            }
        }
        return sb.toString();
    }
}