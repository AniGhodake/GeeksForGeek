#include <bits/stdc++.h>
using namespace std;

class Solution{
public:	
	// Function to check if array has 2 elements
	// whose sum is equal to the given value
	bool hasArrayTwoCandidates(int arr[], int n, int x) {
	    sort(arr,arr+n);
	    int start = 0; 
	    int end = n-1;
	   // int brr[];
	    
	    while(start<end){
	        if((arr[start] + arr[end]) == x){
	           return true;
	        }
	        
	        else if((arr[start] + arr[end]) < x){
	          start++;
	        }
	        
	         if((arr[start] + arr[end]) > x){
	           end--;
	         
	        }
	    }
	    return false;
	}
};

int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        int x;
        cin >> x;
        cin.ignore();

        vector<int> arr;
        string input;
        getline(cin, input); // Read the entire line for the array elements
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }

        Solution ob;
        auto ans = ob.twoSum(arr, x);
        cout << (ans ? "true" : "false") << endl;
        cout << "~" << endl;
    }

    return 0;
}

// } Driver Code Ends