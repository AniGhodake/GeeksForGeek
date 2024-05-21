//{ Driver Code Starts
#include <bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution
{   
    public: 
    //Function to return a list of integers denoting spiral traversal of matrix.
    vector<int> spirallyTraverse(vector<vector<int> > matrix, int r, int c) 
    {
        vector<int>ans;
        int count= 0;
        int totalcount = r*c;
        
        int firstrow = 0;
        int lastcol = c-1;
        int lastrow = r-1;
        int firstcol = 0;
        
        while(count< totalcount){
            
            for(int j = firstcol; j<=lastcol && count < totalcount; j++){
                ans.push_back(matrix[firstrow][j]);
                count++;
            }
            firstrow++;
            
            
            
            for(int i = firstrow; i<=lastrow && count < totalcount; i++){
                ans.push_back(matrix[i][lastcol]);
                count++;
            }
            lastcol--;
            
            
            
            for(int j = lastcol; j >= firstcol && count < totalcount; j--){
                ans.push_back(matrix[lastrow][j]);
                count++;
            }
            lastrow--;
            
            
            for(int i = lastrow; i>= firstrow && count < totalcount; i--){
                ans.push_back(matrix[i][firstcol]);
                count++;
            }
            firstcol++;
            
            
        }
        
        return ans;
        
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin>>t;
    
    while(t--) 
    {
        int r,c;
        cin>>r>>c;
        vector<vector<int> > matrix(r); 

        for(int i=0; i<r; i++)
        {
            matrix[i].assign(c, 0);
            for( int j=0; j<c; j++)
            {
                cin>>matrix[i][j];
            }
        }

        Solution ob;
        vector<int> result = ob.spirallyTraverse(matrix, r, c);
        for (int i = 0; i < result.size(); ++i)
                cout<<result[i]<<" ";
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends