class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList<>();
        fun(n, k ,1,ans , new ArrayList<>());
        return ans;
    }
    public void fun(int n,int k,int stIdx,List<List<Integer>> ans,List<Integer>ll){
        if(ll.size() == k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=stIdx ; i<=n; i++){
            ll.add(i);
            fun(n,k,i+1,ans,ll);
            ll.remove(ll.size()-1);
        }
    }
}