class Solution {
    public List<List<Integer>> combinationSum2(int[] coin, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(coin);
        Combination(coin , target ,new ArrayList<>() ,0,ans);
		return ans;
    }

    public static void Combination(int []coin,int amount,List<Integer> ll,int idx,List<List<Integer>> ans) {
		if(amount == 0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (i > idx && coin[i] == coin[i - 1]) continue;   /** skip duplicates */
            if (coin[i] > amount) break;
				ll.add(coin[i]);
				Combination(coin, amount - coin[i], ll, i+1 , ans );
				ll.remove(ll.size() - 1);
		}
	}
}