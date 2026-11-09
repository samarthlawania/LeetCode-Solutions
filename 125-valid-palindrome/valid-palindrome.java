class Solution {
    public boolean isPalindrome(String s) {
        String str = ""; 
        int i = 0;
        while(i < s.length()){ 
            if(Character.isLetterOrDigit(s.charAt(i))) str += s.charAt(i);
            i++;       
        }
        str = str.toLowerCase();
        i = 0;
        int j = str.length() - 1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
