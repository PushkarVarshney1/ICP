class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)return;
        // Intution  behind is that we apply insertion sort 
        for(int i=0 ; i<n ;i++){
            int j=m-1+i; // adding i b/c nums1 is incremented by 1 step by step,so to find last element of sorted nums1
            int key=nums2[i];
            while(j>= 0 && nums1[j]>key){
                nums1[j+1]=nums1[j];
                j--;
            }
            nums1[j+1]=key;
        }
    }
}