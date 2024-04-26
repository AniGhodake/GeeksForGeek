//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
public:
    int findMin(int arr[], int n){
       
        int s = 0, e = n;
        int ans = arr[0];
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>=arr[0]){
                s = mid +1;          //  THIS CODE WORKS FINE IN VISUAL STUDIO FOR TEST CASE WHICH FAILS IN GFG
            }                         //  BUT IT WONT WORK IN GFG
            else{
                ans = arr[mid];
                e = mid -1;
            }
        }
        return ans;
    }




// int low = 0, high = n-1, mid;
//         while(low < high) {
//         mid = low + (high - low) / 2;
//         if(arr[mid] > arr[high])
//             low = mid + 1;                                //  THIS SOLUTION WORKS FOR THE ALL TEST CASES
//         else
//             high = mid;
//     }
// return arr[low];












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
		int i,a[n];
		for(i=0;i<n;i++)
		{
			cin>>a[i];
		}
		Solution ob;
		cout<<ob.findMin(a, n)<<endl;
	}
	return 0;
}
// } Driver Code Ends