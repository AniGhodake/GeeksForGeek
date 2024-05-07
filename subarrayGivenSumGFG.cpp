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
        sort(arr.begin(),arr.end());
        int start = 0; 
        int end = n-1;
        vector<int>ans;
        
        while(start<end){
            if(arr[start] + arr[end] == s){
                ans.push_back(start);
                ans.push_back(end);
                break;
            }
            else if(arr[start]+ arr[end] < s){
                start++;
            }
            else if(arr[start] + arr[end] > s){
                end--;
            } 
            
            if (end < 0){
            break;
            }
        }
        return ans;
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