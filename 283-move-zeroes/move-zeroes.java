class Solution {
    public void moveZeroes(int[] nums) {
        int c = 0;
        int i = 0;
        int pointer = 0;
        while( i < nums.length){
            if(nums[i] == 0) c++;
            else{
                nums[pointer] = nums[i];
                pointer++;
            }
            i++;
        }
        while(pointer<nums.length){
            nums[pointer] = 0;
            pointer++;
        }
    }
}