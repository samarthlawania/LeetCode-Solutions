//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        ArrayList<String> li = new ArrayList<>();
        solve(s,"",li);
        Collections.sort(li);
        return li;
    }
    public static void solve(String str,String ans,ArrayList<String> li){
        if(str.length()==0){
            if(ans.length()!=0)
            li.add(ans);
            return;
        }
        char ch = str.charAt(0);
        solve(str.substring(1),ans,li);
        solve(str.substring(1),ans+ch+"",li);
    }
}