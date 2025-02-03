class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        return isHelper(s,start,end);
    }

    boolean isHelper(String s, int start, int end) {
        while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
            start++; // Skip non-alphanumeric characters
        }

        while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
            end--; // Skip non-alphanumeric characters
        }

        if (start >= end) {
            return true; // Base case: reached the middle
        }

        if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
            return false; // Mismatch found
        }

        return isHelper(s, start + 1, end - 1); // Recursive call
    }
}