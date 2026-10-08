class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (String word : arr) {
            freqMap.put(word, freqMap.getOrDefault(word,0) + 1);
        }
        for (String word : arr) {
            if (freqMap.get(word) != 1) {
                continue;
            }
            count++;
            if (count == k) {
                return word;
            }
        }
        return "";
    }
}