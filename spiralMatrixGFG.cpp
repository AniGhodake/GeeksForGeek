#include<iostream>
using namespace std;
#define MAX 50
class Solution
{
    public:
    /*You are required to complete this method*/
    int findK(int a[MAX][MAX],int n,int m,int k)
    {
        int totalElements = k;
        int count = 0;
        
        int startRow = 0;
        int startCol = 0;
        int lastRow = n-1;
        int lastCol = m-1;

        while(count<totalElements){
            //first row
            for(int i = startCol; i <= lastCol && count<totalElements; i++){
                //ans.push_back(matrix[startRow][i]);
                count++;
            }
            startRow++;

            // last col
            for(int i = startRow; i <= lastRow && count< totalElements;i++){
                //ans.push_back(matrix[i][lastCol]);
                count++;
            }
            lastCol--;

            //last Row
            for(int i = lastCol; i >=startCol && count < totalElements; i--){
                //ans.push_back(matrix[lastRow][i]);
                count++;
            }
            lastRow--;

            //first col
            for(int i = lastRow; i>=startRow && count < totalElements; i--){
                //ans.push_back(matrix[i][startCol]);
                count++;
            }
            startCol++;
        }
        return count-1;    
    }
};





//{ Driver Code Starts.
// int main()
// {
//     int T;
//     cin>>T;
  
//     while(T--)
//     {
//         int n,m;
//         int k=0;
//         //cin>>k;
//         cin>>n>>m>>k;
//         int a[MAX][MAX];
        
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 cin>>a[i][j];
//             }
//         }
//         Solution ob;
//         cout<<ob.findK(a,n,m,k)<<endl;
        
       
//     }
// }
