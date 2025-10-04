class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> ll= new ArrayList<>();
        for(int i=1;i<=n;i++) ll.add(i);
        helper(n,k,ll,0);
        
        return ll.get(0); // the last element is the remaining ele
    }
    public void helper(int n , int k ,List<Integer> ll,int idx){
        if(ll.size()==1){
            return ;
        }
            // index at which ele is removed
        idx = (idx + k - 1) % ll.size(); 
        ll.remove(ll.get(idx));
        helper(n,k,ll,idx);
    }
}