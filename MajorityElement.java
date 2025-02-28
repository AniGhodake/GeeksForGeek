//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
         int n = arr.length;
        int count = 0; // Counter for the majority element
        Integer candidate = null; // Candidate for the majority element

        // First pass: Find the candidate for the majority element
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Second pass: Verify if the candidate is the majority element
        int occurrences = 0;
        for (int num : arr) {
            if (num == candidate) {
                occurrences++;
            }
        }

        return occurrences > n / 2 ? candidate : -1;
    }
}