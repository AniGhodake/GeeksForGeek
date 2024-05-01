class Solution{
    public:
    // Function to search x in arr
    // arr: input array
    // X: element to be searched for
    int search(int arr[], int N, int X)
    {
        
    //   int s = 0;
    //   int e = N-1;
    //   int mid = s + (e -s ) / 2;
    //   int ans = -1;
       
    //   while(s<=e){
    //       if(arr[mid] == X){
    //           ans = mid;
    //           e = mid-1;
    //       }
    //       else if(arr[mid]<X){
    //           s = mid + 1;
    //       }
    //       else if(arr[mid]>X){
    //           e = mid - 1;
    //       }
           
    //       mid = s + (e -s) / 2;
    //   }
        
    //     return ans;
    int i;
    for (i = 0; i < N; i++)
        if (arr[i] == X)
            return i;
 
    // If the key is not found
    return -1;
    }

};

//{ Driver Code Starts.

int main()
{
    int testcases;
    cin>>testcases;
    while(testcases--)
    {
        int sizeOfArray;
        cin>>sizeOfArray;
        int arr[sizeOfArray];
        int x;
        
        for(int i=0;i<sizeOfArray;i++)
        {
            cin>>arr[i];
        }
        cin>>x;
        Solution ob;
        cout<<ob.search(arr,sizeOfArray,x)<<endl; //Linear search
    }

    return 0;
    
}