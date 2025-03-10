//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution ob = new Solution();
            int ans = ob.editDistance(s1, s2);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int editDistance(String word1, String word2) {
    //     return helper(word1, word2, word1.length(), word2.length());
    // }

    // private int helper(String word1, String word2, int m, int n) {
    //     // If one of the strings is empty, return the other string's length
    //     if (m == 0) return n;
    //     if (n == 0) return m;

    //     // If the last characters match, move to the next part
    //     if (word1.charAt(m - 1) == word2.charAt(n - 1)) {
    //         return helper(word1, word2, m - 1, n - 1);
    //     }                                        ------------ RUNTIME ERROR----------

    //     // If characters are different, consider all three operations
    //     int insert = helper(word1, word2, m, n - 1);
    //     int delete = helper(word1, word2, m - 1, n);
    //     int replace = helper(word1, word2, m - 1, n - 1);

    //     // Take the minimum operation and add 1
    //     return 1 + Math.min(insert, Math.min(delete, replace));
    
    int[][] memo = new int[word1.length() + 1][word2.length() + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return helper(word1, word2, word1.length(), word2.length(), memo);
    }

    private int helper(String word1, String word2, int m, int n, int[][] memo) {
        if (m == 0) return n;
        if (n == 0) return m;
        if (memo[m][n] != -1) return memo[m][n];

        if (word1.charAt(m - 1) == word2.charAt(n - 1)) {
            return memo[m][n] = helper(word1, word2, m - 1, n - 1, memo);
        }

        int insert = helper(word1, word2, m, n - 1, memo);
        int delete = helper(word1, word2, m - 1, n, memo);
        int replace = helper(word1, word2, m - 1, n - 1, memo);

        return memo[m][n] = 1 + Math.min(insert, Math.min(delete, replace));
    }
}