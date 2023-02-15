//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}

// } Driver Code Ends


class GfG
{
    int max_sum(int A[], int n)
    {
        int max=0;
        int cs=0,sum=0,curr_sum=0;
        for(int i=0;i<n;i++){
            cs+=A[i];
        }
        for(int i =0;i<n;i++){
            sum+=i*A[i];
        }
        max=sum;
        for(int i=1;i<n;i++){
            curr_sum=sum-(cs-A[i-1])+A[i-1]*(n-1);
            sum=curr_sum;
            max=Math.max(curr_sum,max);
        }
        return max;
    }	
}
