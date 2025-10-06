class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

            // Using variable size sliding window 
        int si=0;
        int ans=0;
        int p=1;
        for(int ei=0 ; ei<nums.length; ei++){
            p*=nums[ei];
            // shrinking
            while(p>=k && si<=ei){
                p/=nums[si];
                si++;
            }
            ans = ans + (ei-si+1);
        }
        return ans;
    }
}