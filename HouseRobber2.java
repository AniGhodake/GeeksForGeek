//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int n = s.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int[] arr = IntArray.input(br);

            Solution obj = new Solution();
            int res = obj.maxValue(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    int maxValue(int[] nums) {
        int n = nums.length;

        if(n == 1){
            return nums[0];
        }
        if(n == 2){
            return Math.max(nums[0], nums[1]);
        }

        int curr1 ;
        int prev = Math.max(nums[0], nums[1]);
        int prev2 = nums[0];
        curr1 = prev;

        for(int i = 2; i < n-1; i++){
            curr1 = Math.max(nums[i] + prev2, prev);
            prev2 = prev;
            prev = curr1;
        }


        int curr2 = 0;
        prev = Math.max(nums[1], nums[2]);
        prev2 = nums[1];
        curr2 = prev;

        for(int i = 3; i < n; i++){
            curr2 = Math.max(nums[i] + prev2, prev);
            prev2 = prev;
            prev = curr2;
        }

        return Math.max(curr1,curr2);
    }
}