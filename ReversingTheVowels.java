//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u';
    }
    
    String modify (String s)
    {
        int l = 0;
        int h = s.length()-1;
        
        
        char[] ch = s.toCharArray();
        
        while(l < h){
            if(isVowel(ch[l]) && isVowel(ch[h])){
                char temp = ch[l];
                ch[l] = ch[h];
                ch[h] = temp;
                l++;
                h--;
            }
            else if(!isVowel(ch[l])){
                l++;
            }
            else{
                h--;
            }
        }
        s = new String(ch);
        return s;
    }
}