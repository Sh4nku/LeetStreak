class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> words = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while(words.contains(s.charAt(right))) {
                words.remove(s.charAt(left));
                left++;
            }
            words.add(s.charAt(right));
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}