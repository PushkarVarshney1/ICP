class Solution {
    public int numWays(String s) {
        long n = s.length();
        long mod = 1_000_000_007;
        long count = 0;    // here count = total no. of '1' present in string
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        if(count == 0){
            return (int)((((n-1)*(n-2))/2)%mod); 
        }
        if(count % 3 != 0) return 0;
        count = count/3;  // fromNow "count" = total number of '1' present in each box
        long ones=0, firstBox=0, secBox=0 ;  
    
        for (int i = 0; i <n ; i++) {
            if(s.charAt(i)=='1'){
                ones++;
            }
            if(ones==count){
                firstBox++;
            }
            if(ones==2*count){
                secBox++;
            }
        }
        return (int)((firstBox * secBox)%mod) ;
    }
}