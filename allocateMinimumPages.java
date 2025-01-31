//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.findPages(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



//Back-end complete function Template for Java

class Solution {
    
    static boolean isPossibleSolution(int arr[], int n, int k, int sol){
        int pagesum = 0;
        int count = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] > sol){
                return false;
            }
            if(pagesum + arr[i] > sol){
                count++;
                pagesum = arr[i];
                if(count > k){
                    return false;
                }
            }
            else{
                pagesum = pagesum + arr[i];
            }
        }
        return true;
    }
    
    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        if(n < k){
            return -1;
        }
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++){
            end = end + arr[i];
        }
        
        int ans = -1;
    
    
        while(start <= end){
            int mid = (start+end) >> 1;
            if(isPossibleSolution(arr, n, k, mid )){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        
        return ans;
        
    }
}