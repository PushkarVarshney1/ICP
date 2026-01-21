class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        int xor2 = 0;

        for(int v : nums1) xor1 ^= v;
        for(int v : nums2) xor2 ^= v;
        int n1 = nums1.length , n2 = nums2.length;
        if(n1 % 2 != 0 && n2 % 2 != 0) return xor1 ^ xor2;
        else if(n1 % 2 == 0 && n2 % 2 == 0)return 0;
        else{
            if(n1 % 2 == 0)return xor1;
            else return xor2;
        }
    }
}