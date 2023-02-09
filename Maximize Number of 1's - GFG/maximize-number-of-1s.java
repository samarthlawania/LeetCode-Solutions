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
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int m = Integer.parseInt(br.readLine().trim());

            int ans = new Solve().findZeroes(arr, n, m);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends
class Solve {
    int findZeroes(int arr[], int n, int m) {
        int s=0,e=0,l=0,max=0,c=0;
        while(e<n&&s<=e){
            if(arr[e]==0) c++;
            if(c>m){
                if(arr[s]==0) c--;
                 s++;
                while(s<e&&arr[s]==0){
                    c--;
                    s++;
                }
            }
            l = e-s+1;
            if(l>max) max=l;
            e++;
        }
        return max;
    }
}