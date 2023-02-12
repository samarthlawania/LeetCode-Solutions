//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int output[] = new int[2];
        output[1] = MissingNumber(arr,n);
        output[0] = ReapeatingNumber(arr);
        return output;
    }
    int MissingNumber(int nums[],int n){
        Arrays.sort(nums);
        if(n==0) return 1;
        if(nums[0]!=1) return 1;
        for(int i=0;i<n-1;i++){
            if(nums[0]!=1) return 1;
            if(nums[i]!=nums[i+1]&&nums[i]+1!=nums[i+1]) 
            return nums[i]+1;
        }
        return nums[n-1]+1;
    }
    int ReapeatingNumber(int arr[]){
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]-1]++;
            if(ans[arr[i]-1]>1) return arr[i];
        }
        return ans[arr.length-1];
    }
}