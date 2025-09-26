class Solution {
    public int[] searchRange(int[] nums, int target) {
        int c = 0; // range for target
        int[] arr={-1,-1};
        for(int i=0 ; i<nums.length ; i++){
            if( nums[i]==target ){
                c++;
                if(c==1) arr[0]=i; // first idx of target
            }
        }
        if(c!=0)
        {
            arr[1]=arr[0]+c-1; // the last idx of target
        }
        return arr;
    }
}