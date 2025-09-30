class Solution {
    public int longestOnes(int[] nums, int k) {
        int si=0;
        int ei=0;
        int z=0; // Count of zeros within the curr wnd [si, ei]
        int ans = 0;
        while(ei < nums.length){
            if(nums[ei] == 0){
                z++;
            }
        while (z > k) {
            if (nums[si] == 0) {
                z--; 
            }
            si++; // Move 'si' to shrink the window
        }
        // Here the window [si, ei] is valid i.e.(contains at most k zeroes)
        ans = Math.max(ans , ei-si+1);
        ei++;
        }
        return ans;
    }
}