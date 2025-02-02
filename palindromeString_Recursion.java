//{ Driver Code Starts
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine(); // Use lowercase 's'

            Solution ob = new Solution();
            if (ob.isPalindrome(s)) // Check palindrome
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        
        return isHelper(s, start, end);
    }
    
    boolean isHelper(String s ,int start, int end){
        if(start >= end){
            return true;
        }
        
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        
        return isHelper(s, start+1, end-1);
    }
   
};