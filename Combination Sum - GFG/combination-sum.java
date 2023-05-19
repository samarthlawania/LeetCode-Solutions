//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void main (String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        
        while(t-- >0)
        {
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            ArrayList<Integer> list = new ArrayList<>();
            str = br.readLine().trim().split(" ");
            for(int i = 0; i <n ;i++)
                list.add(Integer.parseInt(str[i]));
            str = br.readLine().trim().split(" ");    
            int sum = Integer.parseInt(str[0]);
            
            Solution ob = new Solution();
            
            res = ob.combinationSum(list, sum);
            if (res.size() == 0) {
    			out.print("Empty");
    		}
 
    		// Print all combinations stored in res.
    		for (int i = 0; i < res.size(); i++) {
    			if (res.size() > 0) {
    				out.print("(");
    				List<Integer> ij = res.get(i);
    				for (int j = 0; j < ij.size(); j++) {
    				    
    					out.print(ij.get(j));
    					if(j < ij.size()-1)
    					 out.print(" ");
    				}
    				out.print(")");
    			}
    		}
    		out.println();
    		res.clear();
	    }
	    out.flush();
    }
    
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        ArrayList<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> li1 = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();
    set.addAll(A);
    A.clear();
    A.addAll(set);
    
        Collections.sort(A);
        solve(A,B,li,li1,0);
        return li;
    }
    public static void solve(ArrayList<Integer> A,int B,ArrayList<ArrayList<Integer>> li,ArrayList<Integer> li1,int in){
        if(B==0){
            li.add( new ArrayList<Integer>(li1));
            return;
        }
        if(B<0) return;
        for(int i=in;i<A.size();i++){
            if(B>0){
                li1.add(A.get(i));
                solve(A,B-A.get(i),li,li1,i);
                li1.remove(li1.size()-1);
            }
        }
    }
}