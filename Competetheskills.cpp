
//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// class Solution{
    public:
    void scores(long long a[], long long b[], int &ca, int &cb)
    {
       int Acount = 0;
       int Bcount = 0;
       
       if(a[0]>b[0]){
           Acount++;
       }
       else if(a[0]<b[0]){
           Bcount++;
       }
       
       if(a[1]>b[1]){
           Acount++;
       }
       else if(a[1]<b[1]){
           Bcount++;
       }
       
       if(a[2]>b[2]){
           Acount++;
       }
       else if(a[2]<b[2]){
           Bcount++;
       }
       
       ca = Acount;
       cb = Bcount;
    }
};

//{ Driver Code Starts.
int main()
{
    int t=0;
    cin>>t;
    while(t--)
    {
        long long int a[5], b[5], i=0;
        int ca=0, cb=0;
        for(i=0; i<3; i++)
            cin>>a[i];
    
        for(i=0; i<3; i++)
            cin>>b[i];
        Solution ob;
        ob.scores(a, b, ca, cb);
        
        cout<<ca<<" "<<cb<<endl;
    }
    return 0 ;
}
// } Driver Code Ends
