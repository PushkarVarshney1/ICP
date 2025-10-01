class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // g --> is the greedy array which shows the particular greed of child 
        // s--> cookies to assign
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0; // to iterate in g
        int j=0; // to iterate in s
        int maxC=0;
        while(i<g.length && j<s.length){
            if(s[j] >=g[i]){
                i++;
                j++;
                maxC++;
            }
            else if(s[j] < g[i])j++;
        }
        return maxC;
    }
}