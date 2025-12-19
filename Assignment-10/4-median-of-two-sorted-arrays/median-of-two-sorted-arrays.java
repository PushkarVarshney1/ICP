class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Brute force
        int m = nums1.length;
        int n = nums2.length;
        int s = m+n;
        int []arr=new int[s];
        int j = 0;
        for(int i=0;i<s;i++){
            if(i<m) arr[i]=nums1[i];
            else {
                arr[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(arr);
        int mid=s/2;
        if(s % 2 ==0 ){
            return (double)(arr[mid-1] + arr[mid]) / 2;
        }
        else return arr[mid];
    }
}