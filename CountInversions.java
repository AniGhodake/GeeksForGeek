//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // int n = arr.length;
        // int count = 0;
        // if(arr == null ||  arr.length == 0){   
        //     return 0;
        // }                                     // WORKS TIME LIMIT EXCEED
        
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         if(arr[i] > arr[j]){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        return mergeSortAndCount(arr,0,arr.length -1);
    }
    
    static int mergeSortAndCount(int arr[], int left, int right){
        int count = 0;
        if(left < right){
            int mid = left + (right - left) / 2;
            
            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid +1, right);
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }
    
    static int mergeAndCount(int arr[], int left, int mid, int right) {
    // i: Pointer for the left half, j: Pointer for the right half
    // k: Pointer for merging, swaps: Count of inversions
    int i = left, j = mid + 1, k = 0, swaps = 0;

    // Temporary array to store the merged sorted elements
    int temp[] = new int[right - left + 1];

    // Merge both halves while counting inversions
    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
            // No inversion, copy the smaller element from left half
            temp[k++] = arr[i++];
        } else {
            // Inversion found: arr[i] > arr[j]
            temp[k++] = arr[j++];
            swaps += (mid - i + 1); // All remaining elements in left half are inversions
        }
    }

    // Copy remaining elements from the left half (if any)
    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    // Copy remaining elements from the right half (if any)
    while (j <= right) {
        temp[k++] = arr[j++];
    }

    // Copy merged elements back to the original array
    for (i = left, k = 0; i <= right; i++, k++) {
        arr[i] = temp[k];
    }

    // Return total inversion count
    return swaps;
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}