//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            Solution obj = new Solution();

            System.out.println(obj.countPS(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    public int countPS(String s) {
  
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            count += expandAroundCenter(s, i, i + 1); // Even-length palindromes
            count += expandAroundCenter(s, i, i);     // Odd-length palindromes (skip single-char ones)
        }

        return count;
    }

    private int expandAroundCenter(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if (right - left + 1 >= 2) {  // Only count substrings of length >= 2
                count++;
            }
            left--;   // Expand left
            right++;  // Expand right
        }

        return count;
    }
}