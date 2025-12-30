class Solution {
    private HashMap<Integer , List<Integer>> map;
    public int findCircleNum(int[][] isConnected) {
        map = new HashMap<>();
        for(int i=0;i<isConnected.length;i++)map.put(i , new ArrayList<>());
        for(int i =0; i<isConnected.length; i++){
            for(int j =0; j<isConnected[0].length; j++){
                int ele = isConnected[i][j];
                if(ele == 1){
                    map.get(i).add(j);
                }
            }
        }
        System.out.print(map);
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int i =0 ;i<isConnected.length ; i++){
            int src = i;
            if(!visited.contains(src)){
                st.push(src);
                ans++;
                while(!st.isEmpty()){
                    int r = st.pop();
                    if(visited.contains(r))continue;
                    visited.add(r);
                    
                    for(int nbrs : map.get(r)){
                        if(!visited.contains(nbrs))st.push(nbrs);
                    }
                }
            }
        }
        return ans;
    }
}