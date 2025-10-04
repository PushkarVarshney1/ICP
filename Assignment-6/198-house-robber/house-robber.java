class Solution {
    public int rob(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return Robber(nums,0,dp);
    }
    // Top Down Approach
    public int Robber(int[] arr,int i,int[]dp){
        if(i>=arr.length)return 0;
        if(dp[i] != -1)return dp[i];

        int Rob=arr[i]+Robber(arr,i+2,dp);
        int no_Rob=Robber(arr,i+1,dp);

        return dp[i]=Math.max(Rob,no_Rob);
    }
}