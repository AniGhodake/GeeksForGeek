class Solution{
    public:
    int search(int A[], int l, int h, int key){
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        
        //complete the function here
        int ans = -1;
        while(l<=h){
            int mid = l+(h-l)/2;
            
            if(A[mid] == key){
                ans = mid;
                return ans;
            }
            // LEFT SIDE
            else if(A[mid] >= A[0]){
                if(A[l]<= key && key <= A[mid]){
                    h = mid -1;
                }
                else{
                    l = mid + 1;
                }
            }
            
            // RIGHT SIDE
            else{
                 if(A[mid] <= key && key <= A[h] ) {
                   l = mid + 1;
                }
                else{
                    h = mid -1;
                }
            }
            
        }
        return ans;
    }
};