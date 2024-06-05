//{ Driver Code Starts
#include <bits/stdc++.h>
#include<stdio.h>
#include<math.h>
using namespace std;

// } Driver Code Ends
class Solution
{
public:
    int minValueToBalance(int a[], int n)
    {
       int ans = -1;
       int firstSum = 0;
       int lastSum = 0;
       int mid = n/2;
       
       for(int i = 0; i< mid; i++){
           firstSum += a[i];
       }
       for(int i = mid; i<n; i++){
           lastSum+= a[i];
       }
       
       ans = lastSum-firstSum;
       
       return abs(ans);
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
		cin>>n;
		int a[n];
		for(int i=0;i<n;++i)
			cin>>a[i];
		Solution ob;	
		cout<<ob.minValueToBalance(a,n)<<endl;
	}
	return 0;
}
// } Driver Code Ends