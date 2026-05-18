class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(pattern.length() != words.length) return false;

        HashMap<Character, String> charWords = new HashMap<>();
        HashMap<String, Character> wordChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charWords.containsKey(c)) {
                if (!charWords.get(c).equals(word)) {
                    return false;
                }
            } else {
                charWords.put(c, word);
            }

            if (wordChar.containsKey(word)) {
                if (wordChar.get(word) != c) {
                    return false;
                }
            } else {
                wordChar.put(word, c);
            }
        }
        return true;
    }
}