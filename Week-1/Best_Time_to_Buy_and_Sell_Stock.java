package Week1;

public class Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
															// Brute Force 
		
//		int []prices = {7,1,5,3,6,4};
//		int ans = 0;
//		for(int i=0; i<prices.length; i++) {
//			int x = prices[i];
//			for(int j =i+1; j<prices.length; j++) {
//				ans = Math.max(ans, prices[j] - prices[i]);
//			}
//		}
//		System.out.println(ans);
		
//														TC -> N2
//														SC -> 1
		
															// Optimal
		
		int []prices = {7,6,4,3,1};
		int kharida = Integer.MAX_VALUE;
		int ans = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < kharida) {
				kharida = prices[i];
			}
			else if(prices[i] - kharida > ans)ans = prices[i] - kharida;
		}
		System.out.println(ans);
		
//														TC -> O(n)
//														SC -> O(1)
	}

}
