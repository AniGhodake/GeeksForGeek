//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    vector<int> firstAndLast(vector<int> &arr, int n, int x) {
          int l = 0;
        int r = n - 1;
        int ele1, ele2;
        vector<int> v;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                ele1 = searchlow(arr, mid, n, x);
                ele2 = searchhigh(arr, mid, n, x);

                v.push_back(ele1);
                v.push_back(ele2);

                return v;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else if (arr[mid] > x) {
                r = mid - 1;
            }
        }
        v.push_back(-1);
        return v;
    }
    private:
    int searchlow(vector<int> &arr, int mid, int n, int x) {
        while (arr[mid] == x) {
            mid--;
        }

        return mid + 1;
    }

    int searchhigh(vector<int> &arr, int mid, int n, int x) {
        while (arr[mid] == x) {
            mid++;
        }

        return mid - 1;
    }
    
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, x;
        cin >> n >> x;
        vector<int> arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }

        Solution obj;
        vector<int> ans= obj.firstAndLast(arr, n, x) ;
        for(int i:ans){
            cout<<i<<" ";
        }
        cout<< endl;
    }
    return 0;
}

// } Driver Code Ends