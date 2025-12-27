class Solution {
    public int minArrivalsToDiscard(int[] arr, int w, int m) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int si=0;
        int ei=0;
        int ans=0;
        while(si <= ei && ei < arr.length){
            if((ei-si) == w){
                if(arr[si] != -1 && map.get(arr[si]) > 0){
                    map.put(arr[si] , map.getOrDefault(arr[si],0)-1);
                }
                si++;
            }
            if(map.getOrDefault(arr[ei],0) < m){
                map.put(arr[ei],map.getOrDefault(arr[ei],0)+1);
            }
            else{
                arr[ei] = -1;
                ans++;
            }
            ei++;
        }
        return ans;
    }
}