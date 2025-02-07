//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        
System.out.println("~");
}
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        int n = s.length();
        if(n % 2 != 0){
            return -1;
        }     
        
        Stack<Character> st = new Stack<>();
        int ans = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == '{'){
                st.push(ch);
            }
            else{
                if(! st.isEmpty() && st.peek() == '{'){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        while(! st.isEmpty()){
            Character a = st.peek();
            st.pop();
            
            Character b = st.peek();
            st.pop();
            
            if(a == b){
                ans = ans + 1;
            }
            else{
                ans = ans + 2;
            }
        }
        
        
        return ans;
    }
}



