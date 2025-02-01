//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution obj = new Solution();

            boolean a = obj.areIsomorphic(s1, s2);
            if (a)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1, String s2) {
        
        int hash[] = new int[256];
        boolean isMapped[] = new boolean[256];
        
     
        
        for(int i = 0; i < s1.length(); i++){
            
            char sc = s1.charAt(i);
            char st = s2.charAt(i);
            
            if(hash[sc] == 0){
                if(isMapped[st]){
                    return false;
                }
                hash[sc] = st;
                isMapped[st] = true;
            }
            else if(hash[sc] != st){
                return false;
            }
        }
        return true;
    }
}