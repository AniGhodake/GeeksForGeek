//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    
    // int SolveUsingRecursion(int n, int k){
    //     if(n ==1){
    //         return k;
    //     }
    //     if(n == 2){
    //         return (k+k*(k-1));   // -------- TIME LIMIT EXCEED ---------
    //     }
        
    //     int ans = (SolveUsingRecursion(n-1,k) + SolveUsingRecursion(n-2,k))*(k-1);
        
    //     return ans;
    // }
    
    
    
    
    
    
    // int SolveUsingMem(int n, int k, int arr[]){
    //     if(n ==1){
    //         return k;
    //     }
    //     if(n == 2){
    //         return (k+k*(k-1));
    //     }
        
    //     if(arr[n] != -1){          //  --------MEMOIZATION TOP DOWN APPROACH -----
    //         return arr[n];
    //     }
        
    //     arr[n] = (SolveUsingMem(n-1,k,arr) + SolveUsingMem(n-2,k,arr))*(k-1);
        
    //     return arr[n];
    // }
    
    
    
    
    
    // int SolveUsingTabulation(int n, int k, int arr[]){
        
    //     if (n == 1) return k;
    //     if (n == 2) return k +  k * (k - 1);
        
    //     arr[1] = k;
    //     arr[2] = k + k*(k-1);
        
    //     for(int i = 3; i <= n; i++){
    //         arr[i] = (arr[i-1] + arr[i-2])*(k-1);
    //     }
        
    //     return arr[n];
    // }
    
    int SolveUsingTabSO(int n, int k){
        
        if (n == 1) return k;
        if (n == 2) return k +  k * (k - 1);
        
        int prev2 = k;
        int prev1 = k + k*(k-1);
        int curr=0;
        
        for(int i = 3; i <= n; i++){
            curr = (prev1 + prev2)*(k-1);
            prev2 = prev1;
            prev1 = curr;
        }
        
        return curr;
    }
    
    
    int countWays(int n, int k) {
        // int arr[] = new int[n+1];
        // Arrays.fill(arr,-1);
        // return SolveUsingRecursion(n,k);
        // return SolveUsingMem(n,k,arr);
        // return SolveUsingTabulation(n,k,arr);
        
        return SolveUsingTabSO(n,k);
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            // ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            int ans = ob.countWays(n, k);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends