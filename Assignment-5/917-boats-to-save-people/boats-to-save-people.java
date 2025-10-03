class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); 
        int n=people.length;
    // Using two pointers one at 0 & other at n-1.

        // Here two pointers use b/c we have to take two people only in a boat 
        // So our intution is that first ans {boats} increasing always in loop due to above line .
        // take lower weight and heavy weight people together if their sum is lower than limit left pointer ++.
        // but there's a condition if a heavy people have to sit in a particular boat b/c when light person + heavy person > limit.
        // so in this case we give one whole boat for the heavier one so that lighter is adjusted with another heavier 
        //    which is lighter   than the previous heavier b/c array is sorted.
        int left=0;
        int right=n-1;
        int ans = 0; 
        while(left <= right){
            ans++;
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
        }
        return ans;
    }
}