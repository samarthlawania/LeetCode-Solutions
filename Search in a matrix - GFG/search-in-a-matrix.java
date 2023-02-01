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
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int mat[][] = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                  mat[i][j] = sc.nextInt();
            }
            
            int x = sc.nextInt();
            
            System.out.println (new Sol().matSearch(mat, n, m, x));
        }
        
    }
}
// } Driver Code Ends


class Sol
{
    public static int matSearch(int matrix[][], int n, int m, int target)
    {
        int f=1;
         int a = m-1;
            int b = 0;
        while(b<n && a>=0){
                if (matrix[b][a]==target)
                return 1;
               else if(matrix[b][a]<target){
                b++;
}
            
            else if(matrix[b][a]>target){
                a--;
            }
}
        return 0;
        }
}