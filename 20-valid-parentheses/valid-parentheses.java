class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i<s.length()){
            Character ch = s.charAt(i);
            if(st.size()==0) st.push(ch);
            else{
               char top = st.peek();
                if(top=='('&&ch==')' || top=='['&&ch==']' || top=='{'&&ch=='}' ){
                 st.pop();
                }
                else{
                 st.push(ch);
                }
            }
            i++;
        }
        return st.size()==0?true:false;

    }
}