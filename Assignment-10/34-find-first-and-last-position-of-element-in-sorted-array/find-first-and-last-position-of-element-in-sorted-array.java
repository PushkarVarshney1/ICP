class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        left(nums,target,arr); // find the leftest target
        right(nums,target,arr); // find the righest target
        return arr;
    }
    public void left(int[] nums,int target,int[] arr){
        int lo = 0;
        int hi = nums.length-1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] == target){
                arr[0] = mid;
                hi = mid-1; // move left
            }
            else if(nums[mid] > target)hi = mid-1;
            else lo = mid+1;
        }
    }

    public void right(int[] nums,int target, int []arr){
        int lo = 0;
        int hi = nums.length-1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] == target){
                arr[1] = mid;
                lo = mid+1; // move right
            }
            else if(nums[mid] > target)hi = mid-1;
            else lo = mid+1;
        }
    }
}