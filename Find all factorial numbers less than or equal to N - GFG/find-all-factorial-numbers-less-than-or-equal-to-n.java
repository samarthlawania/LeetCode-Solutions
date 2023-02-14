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
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Long> factorialNumbers(long N){
        ArrayList<Long> li = new ArrayList<>();
        factorial(li,N,1L,1L);
        return li;
    }
    static void factorial(ArrayList<Long>li,long N,long fi,long ans){
        if(fi>N) return;
        else li.add(fi);
        factorial(li,N,fi*(++ans),ans);
    }
}