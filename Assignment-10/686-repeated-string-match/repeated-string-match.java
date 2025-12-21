class Solution {
    public int repeatedStringMatch(String a, String b) {
        if (b.equals("")) return 0;
        StringBuilder sb = new StringBuilder();
        int c = 0;
        while (sb.length() < b.length()) {
            sb.append(a);
            ++c;
        }
        if (sb.toString().contains(b)) return c;
        sb.append(a);
        return sb.toString().contains(b) ? ++c : -1;
    }
}