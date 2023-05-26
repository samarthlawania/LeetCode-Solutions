//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
         if (str.equalsIgnoreCase("Character") )
        {
            return 1;
        }
        else if(str.equalsIgnoreCase("Integer"))
        {
            return 4;
        }
        else if(str.equalsIgnoreCase("Long"))
        {
            return 8;
        }
        else if(str.equalsIgnoreCase("Float"))
        {
            return 4;
        }
        else if(str.equalsIgnoreCase("Double"))
        {
            return 8;
        }
        return 0;
    }
}