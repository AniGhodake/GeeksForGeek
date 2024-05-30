//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
    //Function to find a continuous sub-array which adds up to a given number.
    vector<int> subarraySum(vector<int>arr, int n, long long s)
    {
    int currentSum = arr[0], start = 0, i;
        vector<int> result;

        for (i = 1; i <= n; i++) {
            while (currentSum > s && start < i - 1) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == s) {
                result.push_back(start + 1);
                result.push_back(i);
                return result;
            }

            if (i < n)
                currentSum += arr[i];
        }

        result.push_back(-1);
        return result;
    }
};


//{ Driver Code Starts.

int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        long long s;
        cin>>n>>s;
        vector<int>arr(n);
        // int arr[n];
        const int mx = 1e9;
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        Solution ob;
        vector<int>res;
        res = ob.subarraySum(arr, n, s);
        
        for(int i = 0;i<res.size();i++)
            cout<<res[i]<<" ";
        cout<<endl;
        
    }
	return 0;
}
// } Driver Code Ends