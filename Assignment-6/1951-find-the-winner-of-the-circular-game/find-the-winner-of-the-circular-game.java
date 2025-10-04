class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> ll= new ArrayList<>();
        for(int i=1;i<=n;i++) ll.add(i);
        int idx=0;
        while(ll.size()>1){
            // index at which ele is removed
            idx = (idx + k - 1) % ll.size(); 
            ll.remove(ll.get(idx));
        }
        return ll.get(0); // the last element is the remaining ele
    }
}