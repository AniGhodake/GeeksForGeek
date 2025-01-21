//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
    int n = arr.length;
        int repeating = -1, missing = -1;

        // Step 1: Identify the repeating number
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1; // Convert value to index (1-based to 0-based)

            if (arr[index] < 0) {
                repeating = Math.abs(arr[i]);  // If already negative, found the repeating number
            } else {
                arr[index] = -arr[index];  // Mark element as visited by making it negative
            }
        }

        // Step 2: Identify the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;  // The missing number corresponds to the unvisited index
                break;
            }
        }

        // Store the results
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }
}