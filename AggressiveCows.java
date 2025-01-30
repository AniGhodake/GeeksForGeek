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
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
     
    static boolean isPossible(int stalls[], int n, int k, int sol){
        int count = 1;
        int pos = stalls[0];
        
       
        
        for(int i = 1; i < n; i++){
            if(stalls[i] - pos >= sol){
                count++;
                pos = stalls[i];
            }
            if(count == k){
                return true;
            }
        }
        return false;
    } 
    
     // Merge Sort implementation
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid); // Sort the left half
            mergeSort(arr, mid + 1, right); // Sort the right half

            merge(arr, left, mid, right); // Merge the two halves
        }
    }

    // Merge function for Merge Sort
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    
    public static int aggressiveCows(int[] stalls, int k) {
        
         mergeSort(stalls, 0, stalls.length - 1);
    //   for (int i = 0; i < stalls.length - 1; i++) {
    //         for (int j = 0; j < stalls.length - i - 1; j++) {
    //             if (stalls[j] > stalls[j + 1]) {    
    //                 int temp = stalls[j];
    //                 stalls[j] = stalls[j + 1];   // sprting time limit exceeds
    //                 stalls[j + 1] = temp;
    //             }
    //         }
    //     }
       
       int ans = 0;
       int n = stalls.length;
       int start = 1; 
       int end = stalls[n-1] - stalls[0];
       
       while(start <= end){
           int mid = start + (end-start)/2;
           if(isPossible(stalls, n, k, mid)){
               ans = mid; 
               start = mid + 1;
           }
           else{
               end = mid - 1;
           }
       }
       return ans;
    }
}