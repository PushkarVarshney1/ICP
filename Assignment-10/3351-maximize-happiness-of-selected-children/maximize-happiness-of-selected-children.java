class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        long ans = 0 , c = 0;
        for(int i=n-1; i>=0 && k != 0; i--){
            long ele = happiness[i] - c;
            if(ele > 0) ans += ele;
            c++;
            k--;
        }
        return ans;
    }
}