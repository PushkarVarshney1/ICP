class Solution {
    public int countBeautifulPairs(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            // the first digit
            int fd = Integer.parseInt(String.valueOf(nums[i]).substring(0, 1)); 
            for(int j=i+1;j<nums.length;j++){
                int ld=nums[j]%10; // last digit
                if(gcd(fd,ld)==1){
                    ans++;
                }
            }
        }
        return ans;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;  
    }
}