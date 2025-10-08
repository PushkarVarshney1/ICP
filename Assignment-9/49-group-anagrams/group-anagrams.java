class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        Map< String,List<String> > map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String k=getKey(arr[i]);
            if(! map.containsKey(k)){
                map.put(k , new ArrayList<>());
            }
            map.get(k).add(arr[i]);
        }
        List<List<String>> ll =new ArrayList<>();
        for(String s:map.keySet()){
            ll.add(map.get(s));
        }
        return ll;
    }

    public static String getKey(String s){
        int[] freq = new int[26];
        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int  i =0; i<freq.length; i++){
            sb.append(freq[i]+" ");
        }
        return sb.toString();
    }
}