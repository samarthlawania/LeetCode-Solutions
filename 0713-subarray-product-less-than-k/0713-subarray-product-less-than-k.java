class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int s=0,e=0,p=1,ans=0;
        while(e<nums.length){
            p*=nums[e];
            
            while(p>=k&&s<=e){
                p/=nums[s];
                s++;
            }
            ans = ans+e-s+1;
            e++;
}
        return ans;
    }
}