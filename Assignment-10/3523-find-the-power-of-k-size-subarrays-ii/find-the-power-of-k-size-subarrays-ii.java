class Solution {
    public int[] resultsArray(int[] nums, int k) {
        // Edge cases
        if (k == 1) return nums.clone();
        if (nums.length == 1) {
            if (k == 1) return new int[]{nums[0]};
            else return new int[0];
        }
        int []ans = new int[nums.length - k + 1];
        int x = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] + 1 == nums[i])x++;
            else x = 1;
            if (i >= k - 1) {
                if (x >= k) {
                    ans[i-k+1] = nums[i];
                } else {
                    ans[i-k+1] = -1;
                }
            }
        }
        return ans;
    }
}