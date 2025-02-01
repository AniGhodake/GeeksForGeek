//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length];       // Creating integer array from input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            ArrayList<Integer> result =
                new Solution().findSubarray(arr); // Change List to ArrayList

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
          ArrayList<Integer> currentSubarray = new ArrayList<>();
        ArrayList<Integer> maxSubarray = new ArrayList<>();
        
        // Variables to keep track of sums and indices
        int currentSum = 0;
        int maxSum = 0;
        
        for (int num : arr) {
            // If the number is non-negative
            if (num >= 0) {
                // Add to current subarray and current sum
                currentSubarray.add(num);
                currentSum += num;
                
                // Update max subarray if:
                // 1. Current sum is greater, or
                // 2. Current sum is equal but current subarray is longer
                if (currentSum > maxSum || 
                    (currentSum == maxSum && currentSubarray.size() > maxSubarray.size())) {
                    maxSum = currentSum;
                    maxSubarray = new ArrayList<>(currentSubarray);
                }
            } else {
                // Reset current subarray and sum when a negative number is encountered
                currentSubarray.clear();
                currentSum = 0;
            }
        }
        
        // If no non-negative subarray found, return [-1]
        return maxSubarray.isEmpty() ? new ArrayList<>(Arrays.asList(-1)) : maxSubarray;
    }
}