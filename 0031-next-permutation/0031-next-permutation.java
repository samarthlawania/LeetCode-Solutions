class Solution {
    public void nextPermutation(int[] nums) {
    int i = nums.length-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        int j = nums.length-1;
        if(i>=0){
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
        for(int k =0;k<nums.length;k++){
            System.out.println(nums[k]+" ");
            }
    }
     public static void reverse(int[] arr, int i, int j){
        while (i < j){
            swap(arr, i++, j--);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}