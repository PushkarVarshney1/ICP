class Solution {
    public int subsetXORSum(int[] nums) {
        return fun(nums,0,0);
    }
    public int fun(int []nums , int idx, int ans){
        if(idx >= nums.length){
            return ans;
        }
        // Don't add
        int NOTinclude = fun(nums, idx +1, ans );
        // Add
        int Include = fun(nums, idx+1, ans ^ nums[idx]);

        return Include + NOTinclude;
    }
}