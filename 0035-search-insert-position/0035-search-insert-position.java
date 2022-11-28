class Solution {
    public int searchInsert(int[] nums, int target) {
        int a = 0;
        int b = nums.length-1;
        while(a<=b){
            int mid = (a+b)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                a = mid + 1;
            }
            else
                b = mid - 1;
        }
        return a;
    }
}