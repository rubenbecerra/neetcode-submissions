class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(c,word);
            }

            if (wordToChar.containsKey(word)) {
                if (!wordToChar.get(word).equals(c)) {
                    return false;
                }
            } else {
                wordToChar.put(word,c);
            }
        }
        return true;
    }
}