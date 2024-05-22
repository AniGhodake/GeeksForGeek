//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    int minRow(int n, int m, vector<vector<int>> a) {
      int currMinRow = 0;
      int allTimeMin = INT_MAX;
      int flag;
      
      for(int i = 0; i<n; i++){
          currMinRow = 0;
          for(int j = 0; j<m; j++){
              if(a[i][j] == 1){
                  currMinRow++;
              }
          }
          //allTimeMin = min(currMinRow,allTimeMin);
             if(currMinRow<allTimeMin)   //if cnt<mini then update mini and flag
            {
                allTimeMin=currMinRow;
                flag=i+1;  //since row we have to return is in 1 based indexing so i+1
            }
      }
      return flag;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N, M;
        cin >> N >> M;
        vector<vector<int>> A(N, vector<int>(M));
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                cin >> A[i][j];
            }
        }
        Solution ob;
        cout << ob.minRow(N, M, A) << "\n";
    }
}
// } Driver Code Ends