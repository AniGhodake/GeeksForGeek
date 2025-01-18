
import java.io.*;
import java.util.*;

class GFG {

    
// } Driver Code Ends
// User function Template for Java

static int distinct(int arr[]) {
    Arrays.sort(arr);
   int count = 1;
   for(int i = 1; i< arr.length; i++){
       if(arr[i] != arr[i-1]){
           count++;
       }
   }
  return count;
}

//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(temp[i]);

            System.out.println(distinct(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends