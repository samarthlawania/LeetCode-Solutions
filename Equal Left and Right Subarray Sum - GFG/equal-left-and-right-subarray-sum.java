//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int [] A = new int[N];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < N; i++)
				A[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			System.out.println(ob.equalSum(A, N));
		}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int equalSum(int [] A, int N) {
		int left_Array[] =new int[N];
		int right_Array[] = new int[N];
		left_Array[0] = A[0];
		right_Array[N-1] = A[N-1];
		for(int i=1;i<N;i++){
		    left_Array[i] = left_Array[i-1] + A[i];
		}
		for(int i = N-2;i>=0;i--){
		    right_Array[i] = right_Array[i+1] + A[i];
		}
		for(int i=0;i<N;i++){
		    if(left_Array[i] == right_Array[i]) return i+1;
		}
		return -1;
	}
}