//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] words = sc.nextLine().trim().split(" ");
            Solution obj = new Solution();
            int res = obj.longestStringChain(words);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int longestStringChain(String words[]) {
        
        // Sort words by their lengths (shortest to longest)
        Arrays.sort(words, Comparator.comparingInt(String::length));

        // Store the longest chain for each word
        Map<String, Integer> dp = new HashMap<>();
        int maxLength = 1; // At least one word in the chain

        for (String word : words) {
            int currentLength = 1; // Every word starts with length 1

            // Try removing one letter at a time to find previous words
            for (int i = 0; i < word.length(); i++) {
                String prevWord = word.substring(0, i) + word.substring(i + 1);
                if (dp.containsKey(prevWord)) {
                    currentLength = Math.max(currentLength, dp.get(prevWord) + 1);
                }
            }

            // Store the max chain length for this word
            dp.put(word, currentLength);
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
    
    
}