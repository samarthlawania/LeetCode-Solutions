class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length<=1) return;
        int index = -1;
        int n = nums.length;
        for(int i = n-2; i>=0 ;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index!=-1){
            for(int i = n-1;i>index;i--){
                if(nums[i]>nums[index]){
                    swap(nums,index,i);
                    break;
                }
            }
        }
        reverse(nums,index+1,n-1);
    }
    public static void reverse(int nums[] , int i , int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int nums[] , int i , int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}