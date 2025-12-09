class Solution {
    public static int largest(int[] arr) {
        // code here
        // Arrays.sort(arr);
        // int largest = arr[arr.length-1];
        // return largest;
        
        // int largest = arr[0];
        // for(int i = 1; i < arr.length; i++){
        //     if(arr[i] > largest){
        //         largest = arr[i];
        //     }
        // }
        // return largest;
        
        
        return java.util.Arrays.stream(arr).max().getAsInt();
    }
}