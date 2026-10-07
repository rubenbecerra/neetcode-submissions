class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < words.length; j++) {
                if (j != i) {
                    if (words[j].contains(word)) {
                        result.add(word);
                        break;
                    }
                }
            }
        }
        return result;
    }
}