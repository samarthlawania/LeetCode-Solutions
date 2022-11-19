class Solution {
    public int reverse(int x) {
      if(x>0){
          try{
          StringBuilder str = new StringBuilder(String.valueOf(x));
          return Integer.parseInt(str.reverse().toString());
      }
       catch(NumberFormatException e){
           return 0;
       } 
      }
        else{
            try{
         StringBuilder str = new StringBuilder(String.valueOf(-1*x));
          return -1*Integer.parseInt(str.reverse().toString());
      }
       catch(NumberFormatException e){
           return 0;
       } 
        }
    }
}