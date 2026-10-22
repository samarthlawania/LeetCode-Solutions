class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;
        int i = 1;
        int pointer = 0;
        while(i<nums.length){
            if(nums[i]!=nums[pointer]){
                nums[++pointer] = nums[i];
            }
            i++;
        }
        return pointer+1;
    }
}