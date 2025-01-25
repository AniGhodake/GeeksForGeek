//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = (int)i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.firstRepeated(arr));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr) {
        // int repeated = 0;
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // for(int i : arr){
        //     hm.put(i, hm.getOrDefault(i,0)+1);
        // }
                                                       //  NOT SUCCEED
        // for(int i : hm.keySet()){
        //     if(hm.get(arr[i]) > 1){
        //         return i+1;
        //     }
        // }
        // return -1;
        int repeated = -1;
        HashSet<Integer> seen = new HashSet<>();
        for(int i =arr.length -1; i >= 0; i--){
            if(seen.contains(arr[i])){
                repeated = i;
            }
            else{
                seen.add(arr[i]);
            }
        }
        
        if(repeated == -1){
            return repeated;
        }
        else{
            return repeated + 1;
        }
    }
}
