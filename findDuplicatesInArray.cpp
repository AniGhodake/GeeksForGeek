//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution{
  public:
    vector<int> duplicates(long long arr[], int n) {
        vector<int>ans;

        //int sum = 0;
        int element;
        int j = 0;
       
        sort(arr, arr+n);
        for(int i = 0; i< n; i++){
           if(arr[i]==arr[i+1] && arr[i+1]<n){
             element = arr[i];
           
                   ans.push_back(element);
                  
          
             
             
           }
            
        }
        if(ans.empty()){
            int noDuplicate = -1;
            ans.push_back(noDuplicate);
        }
        // else if (ans.size() == 1){
        //     int oneElement = 1;
        //     ans.push_back(oneElement);
        // }
        //int size = ans.size();
         ans.erase(unique(ans.begin(), ans.end()), ans.end());
        return ans;
    }
};



//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t-- > 0) {
        int n;
        cin >> n;
        long long a[n];
        for (int i = 0; i < n; i++) cin >> a[i];
        Solution obj;
        vector<int> ans = obj.duplicates(a, n);
        for (int i : ans) cout << i << ' ';
        cout << endl;
    }
    return 0;
}

// } Driver Code Ends