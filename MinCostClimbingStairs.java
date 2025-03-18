//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int n = str.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            int res = sln.minCostClimbingStairs(arr);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


//Back-end complete function Template for Java

class Solution {
    
    // static int ways(int n, int cost[]){
    //     if(n <= 1){
    //         return 0;       -----------TIME LIMIT EXCEED -------
    //     }
        
    //     return Math.min(cost[n-1] + ways(n-1,cost), cost[n-2] + ways(n-2,cost));
    // }
    
    
    //********************************************************************************
    
    // static int ways(int n, int cost[], ArrayList<Integer>dp){
    //     if(n <= 1){
    //         return 0;
    //     }
        
    //     if(dp.get(n) != -1){
    //         return dp.get(n);
    //     }
        
    //     int minCost = Math.min(cost[n-1] + ways(n-1,cost,dp), cost[n-2] + ways(n-2,cost,dp));
    //     dp.set(n, minCost);
    //     return dp.get(n);
    // }
    
    // **********************************************************************************
    
  
    
    static int minCostClimbingStairs(int[] cost) {
       int n = cost.length;
       ArrayList<Integer>dp = new ArrayList<>();
       for(int i = 0; i <= n; i++){
           dp.add(-1);
       }
       
        // dp.set(0, cost[0]);
        // dp.set(1, cost[1]);
    //   for(int i = 2; i < n; i++){
        //   int minCost = cost[i] + Math.min(dp.get(i - 1), dp.get(i - 2));
        //   dp.set(i,minCost);
                                // -----------BOTTOM UP APPROACH ------------------
    //   }
    //     return Math.min(dp.get(n - 1), dp.get(n - 2));
    
    int prev = 0;
    int curr=0;
    int prev1 = 0;        //  ------- MOST OPTIMIZED APPROACH ----------

    for(int i = 2; i <= n; i++){
       curr = Math.min(cost[i-1] + prev, cost[i-2] + prev1);
       prev1 = prev;
       prev = curr;
    }
    
    return curr;

    }
    
    
};