class Solution {
    public int minimizeXor(int num1, int num2) {
        int setBit = Fast_Count_Set(num2);
        int x = 0;
        for(int i=30; i>=0; i--) {
        	int mask = (1 << i);
        	if((num1 & mask) != 0) {
        		x |= mask;
        		setBit --;
        		if(setBit == 0)return x;
        	}
        }
        for (int i = 0; i <= 30; i++) {
			int mask = (1 << i);
			if((num1 & mask) == 0) {
				x |= mask;
				setBit--;
				if(setBit == 0)return x;
			}
		}
        return x;
    }
    public static int Fast_Count_Set(int n) {
		int ans = 0 ;
		while(n > 0) {
			n = n & (n-1);
			ans++;
		}
		return ans;
	}
}