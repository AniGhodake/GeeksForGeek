#include<iostream>
using namespace std;
#include <algorithm>
#include<vector>


// } Driver Code Ends

    // arr: input array
    // n: size of array
    //Function to sort the array into a wave-like array.
    void convertToWave(int n, vector<int>& arr){
        
        for(int i = 0; i < n-1 ; i+2){
            //int j = i+1;
            
            swap(arr[i],arr[i+1]);
        }
        
        // for(int i = 0; i < n; i++){
        //     cout<<arr[i]<<" ";
        // }
        // cout<<endl;
    }

//{ Driver Code Starts.

int main()
{
    int t,n;
   cout<<"enter the value of n:"<<endl;
        cin>>n; //input size of array
        vector<int> a(n); //declare vector of size n
        for(int i=0;i<5;i++)
            cin>>a[i]; //input elements of array
        //sort(a.begin(),a.end());
        //Solution ob;
        convertToWave(n, a);

        for(int i=0;i<n;i++)
            cout<<a[i]<<" "; //print array
            
        cout<<endl;
    
}