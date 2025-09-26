class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
		TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] ans = new int[n - k + 1];
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ans[0] = map.lastKey();
        for (int i = k; i < n; i++) {
            int temp = nums[i - k];
            map.put(temp, map.get(temp) - 1);
            if (map.get(temp) == 0) {
                map.remove(temp);
            }
            int add = nums[i];
            map.put(add, map.getOrDefault(add, 0) + 1);
            ans[i - k + 1] = map.lastKey();
        }

        return ans;
    }
}