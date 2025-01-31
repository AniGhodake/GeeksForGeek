class Solution {
    static boolean isPossibleSol(int arr[], int n, int k, int sol){
        int sum = 0;
        int count = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] > sol){
                return false;
            }
            if(sum + arr[i] > sol){
                count++;
                sum = arr[i];
                if(count > k){
                    return false;
                }
            }
        }
        return true;
    }
    
    public int minTime(int[] arr, int k) {
        int n = arr.length;
        int ans = -1;
        
        int start = 0;
        int end = 0;
        for(int i = 0; i < n; i++){
            end = end + arr[i];
        }
        
        while(start <= end){
            if(isPossibleSol(arr,n,k,mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}