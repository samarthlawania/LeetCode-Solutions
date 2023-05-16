//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    static String key[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        ArrayList<String> li = new ArrayList<>();
        solve(key,a,"",li,N,0);
        return li;
    }
    public static void solve(String key[],int a[],String ans,ArrayList<String> li,int N,int in){
        if(N==in){
            li.add(ans);
            return;
        }
        String str = key[a[in]];
        for(int i=0;i<str.length();i++){
            solve(key,a,ans+str.charAt(i),li,N,in+1);
        }
    }
}


