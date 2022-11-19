class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
        for(int i=nums1.length;i-nums1.length<nums2.length;i++){
            arr[i] = nums2[i-nums1.length];
}
        Arrays.sort(arr);
        int len = arr.length;
        if((arr.length)%2==0) return (arr[len/2] + arr[(len/2)-1])/2.0;
        return arr[(len/2)];
    }
}