#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;



string calc_Sum(int *a,int n,int *b,int m){
        int i = n-1;
        int j = m-1;
        int carry = 0;
        string ans;
        
        while(i>=0 && j>=0){
            int x = a[i] + b[j] + carry;
            int digit = x%10;
            ans.push_back(digit + '0');
            carry = x /10 ;
            i--,j--;
        }
        while(i>=0){
            int x = a[i] + carry;
            int digit = x%10;
            ans.push_back(digit + '0');
            carry = x /10 ;
            i--;
        }
        while(j>=0){
            int x = b[j] + carry;
            int digit = x%10;
            ans.push_back(digit + '0');
            carry = x /10 ;
            j--;
        }
        
        if(carry){
            ans.push_back(carry + '0');
        }
        
        while(ans[ans.size()-1] == 0){
            ans.pop_back();
        }
        
        reverse(ans.begin(),ans.end());

            cout<<"elements are : "<<endl;
            for(int i = 0; i < ans.size(); i++){
                cout<<ans[i]<<" ";
            }
            cout<<endl;

        return ans;
    }


int main() {
   
	
	    int n;
        cout<<"enter the value of n :"<<endl;
	    cin>>n;
	    int a[n];
        cout<<"enter n elements :"<<endl;
	    for(int i=0;i<n;i++){
	        cin>>a[i];
	    }
	    int m;
        cout<<"enter the value of m :"<<endl;
	    cin>>m;
	    int b[m];
        cout<<"enter m elements :"<<endl;
	    for(int i=0;i<m;i++){
	        cin>>b[i];
	    }
	    
	    calc_Sum(a,n,b,m);
	
	return 0;
}