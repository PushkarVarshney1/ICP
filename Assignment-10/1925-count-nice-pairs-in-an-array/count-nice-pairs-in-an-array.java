class Solution {
    public int countNicePairs(int[] nums) {
        int ans = 0;
        int MOD = (int) 1e9 + 7;

        // let x = nums[i] and y = nums[j];
        // Formula ---> x - rev(x) = y - rev(y)

        for(int i=0; i<nums.length; i++){
            // To reverse the number 
            String s = Integer.toString(nums[i]);
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            String rev = sb.toString();

            // Update or change the ele acc to formula
            nums[i] = nums[i] - Integer.parseInt(rev);
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int a : nums){
            ans = (ans + map.getOrDefault(a , 0)) % MOD; // take this seriously to correct answer
            map.put(a , map.getOrDefault(a,0)+1);
        }
        return ans;
    }
}