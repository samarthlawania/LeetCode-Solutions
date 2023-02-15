//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int len) 
	{ 
        long ans1[] = new long[len];
        ans1[0]=1;
        
        long ans2[] = new long[len];
        ans2[len-1]=1;
        
        for(int i = 1;i<len;i++){
            ans1[i] = ans1[i-1]*nums[i-1];
        }
         for(int i = len-2;i>=0;i--){
            ans2[i] = ans2[i+1]*nums[i+1];
        }
         for(int i=0;i<len;i++){
            ans2[i] = ans2[i]*ans1[i];
       }
        return ans2;
	} 
} 
