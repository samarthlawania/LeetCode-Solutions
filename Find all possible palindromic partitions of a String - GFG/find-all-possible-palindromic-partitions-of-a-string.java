//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        ArrayList<ArrayList<String>> li = new ArrayList<ArrayList<String>>();
        ArrayList<String> li1 = new ArrayList<>();
        solve(S,li,li1);
        return li;
    }
    public static void solve(String str,ArrayList<ArrayList<String>> li,ArrayList<String> li1){
        if(str.length()==0) {
            li.add(new ArrayList(li1));
			//System.out.println(ans);
			return;
		}
		for(int i=1;i<=str.length();i++) {
			String s = str.substring(0,i);
			if(ispallandrome(s)){
                li1.add(s);
                solve(str.substring(i),li,li1);
                li1.remove(li1.size()-1);
            }
		}
    }
     public static boolean ispallandrome(String str) {
		String temp = "";
		for(int i=str.length()-1;i>=0;i--) temp+=str.charAt(i);
		 return str.equals(temp);
	}
};