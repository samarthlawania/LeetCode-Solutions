//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> li = new ArrayList<>();
        boolean f = false;
        int start=0,e=0,sum=0;
        while(e<n&&start<=e){
            sum+=arr[e];
            if(sum==s){
                li.add(start+1);
                li.add(e+1);
                break;
            }
            else if(sum>s){
                while(sum>s&&start<e){
                    sum-=arr[start];
                     start++;
                    if(sum==s){
                         li.add(start+1);
                        li.add(e+1);
                        f = true;
                        break;
                    }
                }
            }
            if(f) break;
            e++;
        }
        if(li.size()==0) {
            li.add(-1);
        }
        return li;
    }
}