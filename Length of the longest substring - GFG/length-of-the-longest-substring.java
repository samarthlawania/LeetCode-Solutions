//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestUniqueSubsttr(String str){
        int s=0,e=0,l=1,max=0;
        String st = "";
        while(e<str.length()&&s<=e){
            String c = str.charAt(e)+"";
            if(!(st.contains(c))) {
                l = e-s+1;
              //  st = str.substring(s,e+1);
            }
            if(s<=e&&st.contains(c)){
                s=st.length()-st.indexOf(c)-1;
                st=st.substring(st.indexOf(c)+1);
            }
       //     System.out.println("e"+e+"s"+s);
       st = st+c;
        //    System.out.println(st);
            l = st.length();
            max = Math.max(l,max);
            e++;
        //    System.out.println(st);
           // if(e<str.length()-1)
        }
        return max;
    }
 /*   static boolean frq(String str,int s,int e){
        int frq[] = new int[26];
        for(int i=s;i<=e;i++){
            frq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(frq[i]>1) return false;
        }
        return true;
    } */
}