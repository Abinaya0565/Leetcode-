class Solution {
    public int lengthOfLongestSubstring(String s) {
         final int ASCII_SIZE = 128;
        int n = s.length();
        int maxLength = 0;
        int[] lastSeen = new int[ASCII_SIZE]; // Index + 1 of last occurrence

        int start = 0; // Start of current substring window
        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            start = Math.max(lastSeen[currentChar], start);
            maxLength = Math.max(maxLength, end - start + 1);
            lastSeen[currentChar] = end + 1; // Store index + 1
        }

        return maxLength;
    }
}