//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            // calling method findMaxSum() of class solve
            System.out.println(new Solution().findMaxSum(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int findMaxSum(int arr[]) {
        int n = arr.length;
        
        int curr = 0;
        int prev1 = arr[0];
        int prev = Math.max(arr[0], arr[1]);
        
        if(n == 1){
            return arr[0];
        }
        if(n == 2){
            return Math.max(arr[0],arr[1]);
        }
        
        for(int i = 2; i < n; i++){
            curr = Math.max(arr[i] + prev1, prev);
            prev1 = prev;
            prev = curr;
        }
        
        return curr;
        
    }
}