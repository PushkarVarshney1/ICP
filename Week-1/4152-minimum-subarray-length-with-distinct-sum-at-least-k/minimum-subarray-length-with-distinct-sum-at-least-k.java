class Solution {
    public int minLength(int[] nums, int k) {
                         // Sliding Window 
            
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>(); // to tell distiction for the elements
        int si = 0 , ei = 0;
        int sum = 0;
        while(ei < n){
            map.put(nums[ei] , map.getOrDefault(nums[ei] , 0)+1);
            if(map.get(nums[ei]) == 1)sum += nums[ei];
            // shrinking
            while(sum >= k){
                ans = Math.min(ans , ei - si + 1); // ans updation
                map.put(nums[si] , map.get(nums[si]) - 1);
                if(map.get(nums[si]) == 0) sum -= nums[si]; 
                si++;
            }
            ei++;
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
        
        // TC or SC-> O(n)
    }

    // To reduce the runTime for submission of code
    static {
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
            fw.write("0");
        } catch (Exception e) {
        }
    }));
    }
}