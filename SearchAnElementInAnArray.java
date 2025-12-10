class Solution {
    public int search(int arr[], int x) {
        // code here
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
        
        
        // int index = Arrays.binarySearch(arr, x);
        // if(index >= 0) return index;                 IF SORTED ARRAY THEN ONLY WORKS
        // return -1;
    }
}
