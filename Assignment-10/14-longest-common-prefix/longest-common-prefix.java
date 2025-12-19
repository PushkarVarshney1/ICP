class Solution {
    public String longestCommonPrefix(String[] v) {
        // Note that common prefix is must be at the same indices 
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0]; // smallest string
        String last = v[v.length-1]; // largest string
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }                                                                                                     return ans.toString();
    }
}