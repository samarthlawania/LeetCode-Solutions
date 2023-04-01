//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends
class Solution
{
    public static int[] calculateSpan(int price[], int n)
    {
        return NGE(price);
    }
    public static int[] NGE(int[] arr) {
		int nge[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		nge[0] = 1;
		int c = 1;
		for(int i = 1;i<arr.length;i++){
		    if(arr[st.peek()]<=arr[i]){
		        c = 1;
		     //   System.out.println("dc");
		        int in = i-1;
		        while(!st.empty()&&arr[st.peek()]<=arr[i]){
		           // System.out.println("dc");
		            c+=nge[st.peek()];
		            st.pop();
		        }
		        nge[i] = c;
		    }
		    else{
		        c=1;
		        nge[i]=1;
		    }
		    st.push(i);
		}
		return nge;
	}
}