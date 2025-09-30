class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0 , si=0;
        // sliding Window
        for(int ei =0; ei<s.length(); ei++){
            char ch=s.charAt(ei);
            // condition if character is getting duplicate
            if(map.containsKey(ch) && map.get(ch)>=si){
                si=map.get(ch)+1;
            }
            map.put(ch,ei);
            ans=Math.max(ans , ei-si+1);
        }
        return ans;
    }
}