//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
       ArrayList<String> li = new ArrayList<>();
       solve(S,"",li);
       Collections.sort(li);
       return li;
    }
    public void solve(String s,String ans, ArrayList<String> li){
        if(s.length()==0){
            li.add(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            boolean flag = true;
            for(int j = i+1;j<s.length();j++){
                if(s.charAt(j)==ch){
                    flag = false;
                    break;
                }
            }
            if(flag){
            String rs = s.substring(0,i)+s.substring(i+1);
            solve(rs,ans+ch,li);
            }
        }
    }
}