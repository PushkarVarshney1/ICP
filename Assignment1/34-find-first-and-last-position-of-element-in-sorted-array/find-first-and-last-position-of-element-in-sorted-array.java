class Solution {
    public int[] searchRange(int[] nums, int target) {
        int c = 0;
        int[] arr={-1,-1};
        for(int i=0 ; i<nums.length ; i++){
            if( nums[i] == target ){
                c++;
                if(c==1) arr[0]=i;
            }
        }
        if(c > 0)
            arr[1]=arr[0]+c-1;
        return arr;
    }
}