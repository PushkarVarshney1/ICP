class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> end = new HashMap<>();
        for(int a : nums) map.put(a,map.getOrDefault(a,0)+1);
        for(int a : nums){
            if(map.get(a) == 0) continue;
            if (end.getOrDefault(a - 1, 0) > 0) {
                end.put(a - 1, end.get(a - 1) - 1);
                end.put(a, end.getOrDefault(a, 0) + 1);
                map.put(a, map.get(a) - 1);
            }
            else if(map.getOrDefault(a+1,0) > 0 && map.getOrDefault(a+2,0) > 0){
                map.put(a , map.get(a)-1);
                map.put(a+1 , map.get(a+1)-1);
                map.put(a+2 , map.get(a+2)-1);
                end.put(a+2 , end.getOrDefault(a+2,0)+1);
            }
            else return false;
        }
        return true;
    }
}