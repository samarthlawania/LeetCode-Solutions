//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st1 = new Stack<>();
    /*returns min element from stack*/
    int getMin()
    {
        if(st.empty()) return -1;
	 return st.peek();
	
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	 if(!st.empty()){
	     int a = st.peek();
        int b = st1.peek();
        if(a==b){
            st.pop();
        }
	 }
        if(st1.empty()) return -1;
         return st1.pop();
    }

    /*push element x into the stack*/
    void push(int x)
    {
	 if(st.size()==0||st.peek()>=x) {
          //  System.out.println("1");
            st.push(x);
        }
       // System.out.println("-0");
        st1.push(x);
    }	
}

