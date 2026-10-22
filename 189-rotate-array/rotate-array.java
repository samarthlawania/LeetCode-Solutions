class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length) k = k % nums.length;
        reverse(nums,0,nums.length - k - 1);
        reverse(nums,nums.length - k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public void reverse(int[] nums ,int i ,int j){
        int start = i;
        int end = j;
        while(end>=start){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            end--;
            start++;
        }
    }
}