//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
                out.println("~");
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    // static int ways(int n, ArrayList<Integer>dp){
        // if(n <= 1){
        //     return 1;
        // }
        
        // if(n == 2){
        //     return 2;
        // }
        
        
    //     if(dp.get(n) != -1){
    //         return dp.get(n);
    //     }
        
    //      dp.set(n, ways(n - 1, dp) + ways(n - 2, dp) + ways(n - 3, dp));
    //     return dp.get(n);
    // }
    
    
    
    //  --------I HAVE USED MANY METHODS HERE TO SOLVE PROBLEM--------
  
  
  
    static int countWays(int n) {
        // ArrayList<Integer> dp = new ArrayList<>();
        // // for(int i = 0; i <= n; i++){
        // //     dp.add(-1);
        // // }
        // // return ways(n,dp);
        // dp.add(1);
        // dp.add(1);
        // dp.add(2);
        
        // for(int i = 3; i <= n; i++){
        //     dp.add(dp.get(i-1) + dp.get(i-2) + dp.get(i-3));
        // }
        // return dp.get(n);
        
        
        
        if(n <= 1){
            return 1;
        }
        
        if(n == 2){
            return 2;
        }
        
        int prev2 = 1;
        int prev1 = 1;
        int prev = 2;
        int curr=0;
        
        for(int i = 3; i <= n; i++){
            curr = prev + prev1 + prev2;
            
            prev2 = prev1;
            prev1 = prev;
            prev = curr;
        }
        
        return curr;
    }
}