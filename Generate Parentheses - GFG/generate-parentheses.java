//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        List<String> list = new ArrayList<>();
        solve(n,0,0,"",list);
        return list;
    }
    public static void solve(int n,int open,int close,String ans,List<String> li){
        if(close==n&&open==n){
            li.add(ans);
            return;
        }
        if(open<n) solve(n,open+1,close,ans+"(",li);
        if(close<open) solve(n,open,close+1,ans+")",li);
    }
}