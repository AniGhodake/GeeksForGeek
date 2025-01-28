//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int ans = ob.countPairs(arr, k);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    int countPairs(int[] arr, int k) {
       
       if (arr == null || arr.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // Store the frequency of each number in the array
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Traverse the array and check for valid pairs
        for (int num : arr) {
            if (map.containsKey(num + k)) {
                count += map.get(num + k);
            }
            if (map.containsKey(num - k)) {
                count += map.get(num - k);
            }
            // Reduce the count of the current number to avoid double-counting
            map.put(num, map.get(num) - 1);
        }

        return count;
    }
}