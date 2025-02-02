//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.reverse(s));                        
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverse(String str)
    {
        int start = 0;
        int end = str.length() - 1;
        
        char temp;
        char[] ch = str.toCharArray();
        
        while(start < end){
            if(Character.isLetter(ch[start]) && Character.isLetter(ch[end])){
                   temp = ch[start];
                   ch[start] = ch[end];
                   ch[end] = temp;
                   start++;
                   end--;
            }
            else if(!Character.isLetter(ch[start])){
                   start++;
            }
            else{
                end--;
            }
               
            
        }
        str = new String(ch);
            return str;
    }
}