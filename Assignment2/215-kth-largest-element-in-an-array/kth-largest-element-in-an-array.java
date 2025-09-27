class Solution {
    public int findKthLargest(int[] nums, int k) {
        // use pq b/c we want to get the smaller at the first position
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        // somethingg like sliding wnd 
        for(int i=0 ; i<k; i++){
            pq.add(nums[i]);
        }
        for(int i=k; i<nums.length; i++){
            if(nums[i] > pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        // At last we have pq having the largest k elements , so first is the largest k th element
        return pq.poll();
    }
}