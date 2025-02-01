//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    void mergeSort1(int nums[], int l, int r) {
         mergeSort(nums, 0, (nums.length)-1);
    }
    
    void mergeSort(int nums[], int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;

            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }
    
    void merge(int nums[], int left, int mid, int right){
        int n1 = mid - left + 1;  // left halve size
        int n2 = right - mid;     // right halve size

        int leftarr[] = new int[n1];
        int rightarr[] = new int[n2];

        for(int i = 0; i < n1; i++){
            leftarr[i] = nums[left + i];
        }

        for(int j = 0; j < n2; j++){
            rightarr[j] = nums[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < n1 && j < n2){
            if(leftarr[i] <= rightarr[j]){
                nums[k++] = leftarr[i++];
            }
            else{
                nums[k++] = rightarr[j++];
            }
        }

        while(i < n1){
            nums[k++] = leftarr[i++];
        }
        while(j < n2){
            nums[k++] = rightarr[j++];
        }
    }
    
}
