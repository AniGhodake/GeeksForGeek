//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends


class Solution {

    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        int maxLength = 0;
        int startIdx = 0;

    for (int i = 0; i < arr.length; i++) {
        int currentMin = arr[i];
        int currentMax = arr[i];

        for (int j = i; j < arr.length; j++) {
            currentMin = Math.min(currentMin, arr[j]);
            currentMax = Math.max(currentMax, arr[j]);

            if (Math.abs(currentMax - currentMin) <= x) {
                if (j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    startIdx = i;
                }
            } else {
                break;
            }
        }
    }

    // Create the result ArrayList
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = startIdx; i < startIdx + maxLength; i++) {
        result.add(arr[i]);
    }

    return result;
    }
}


//{ Driver Code Starts.
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
            ArrayList<Integer> ans = ob.longestSubarray(arr, k);

            // Print the result as a space-separated string
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line after printing the results
            System.out.println("~");
        }
    }
}