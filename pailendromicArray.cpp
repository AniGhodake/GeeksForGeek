//{ Driver Code Starts
#include<iostream>
#include<string.h>
using namespace std;


// } Driver Code Ends
/*Complete the function below*/

class Solution {
public:


    bool pailendrom(int n){
        int copy = n;
        int rem = 0;
        int ans = 0;
        
        while(n>0){
            rem = n%10;
            ans = ans * 10 + rem;
            n = n/10;
            
        }
        if(copy == ans){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    int PalinArray(int a[], int n)
    {
    	for(int i = 0; i< n; i++){
    	    bool ans = pailendrom(a[i]);
    	    if(ans == false){
    	        return 0;
    	    }
    	}
    	return 1;
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
		for(int i = 0; i < n; i++)
			cin>>a[i];
		Solution obj;
		cout<<obj.PalinArray(a,n)<<endl;
	}
}
// } Driver Code Ends