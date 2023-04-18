//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        int f1[] = new int[26];
        int f2[] = new int[26];
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) f1[a.charAt(i)-'a']++;
        for(int i=0;i<b.length();i++) f2[b.charAt(i)-'a']++;
        for(int i=0;i<26;i++) if(f1[i]!=f2[i]) return false;
        return true;
    }
}