class Solution {
    public int subsetXORSum(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        return fun(nums,0,ll,0);
    }
    public int fun(int []nums , int idx, List<Integer> ll,int ans){
        if(idx >= nums.length){
            if(ll.size() == 1)ans+=ll.get(0);
            else {
                int XOR = 0;
                for(int a : ll){
                    XOR ^= a;
                }
                ans+=XOR;
            }
            return ans;

        }
        // Don't add
        int NOTinclude = fun(nums, idx +1, ll,ans);
        // Add
        int x = nums[idx];
        ll.add(x);
        int Include = fun(nums, idx+1, ll, ans);
        ll.remove(ll.size()-1);

        return Include + NOTinclude;
    }
}