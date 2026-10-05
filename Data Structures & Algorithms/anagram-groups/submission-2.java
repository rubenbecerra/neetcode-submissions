class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> list = new HashMap<>();
        for (String word : strs) {
            char[] current = word.toCharArray();
            Arrays.sort(current);
            String key = new String(current);
            list.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        List<List<String>> result = new ArrayList<>(list.values());
        return result;
    }
}
