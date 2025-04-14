//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    int countTriplet(int arr[]) {
      Arrays.sort(arr);
        int n = arr.length;
        int count = 0;

        for (int k = n - 1; k >= 0; k--) {
            int target = arr[k];
            int i = 0, j = k - 1;

            while (i < j) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    count++;
                    i++;
                    j--;
                } else if (sum < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return count;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
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
            Solution obj = new Solution();
            int res = obj.countTriplet(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends