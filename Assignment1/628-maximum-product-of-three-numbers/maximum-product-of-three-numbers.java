class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        if(nums[0] <0 && nums[1]<0)max=nums[n-1]*nums[0]*nums[1];
        max=Math.max(nums[n-1]*nums[n-2]*nums[n-3] , max);
        return  max;
    }
}