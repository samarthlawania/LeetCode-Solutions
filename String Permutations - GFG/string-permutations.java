//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String>ans=new ArrayList<String>();
        String s="";
        per(S,ans,s);
        Collections.sort(ans);
        return ans;
    }
       
    public void per(String s,ArrayList<String>ans,String op)
    {
        if(s.length()==0)
        {
            ans.add(op);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            boolean flag = true;
                String temp=s.substring(0,i)+s.substring(i+1);
                per(temp,ans,op+curr);
        }
    }
}