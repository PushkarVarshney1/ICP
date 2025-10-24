class Solution {
    class Pair {
        char ch;
        int count;
        public  Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) {
        // Stack of pairs: [character, count]
        Stack<Pair> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            // If same as previous char, increment count
            if (!st.isEmpty() && st.peek().ch == ch) {
                st.peek().count++;

                // When count reaches k, pop it (remove those k duplicates)
                if (st.peek().count == k) {
                    st.pop();
                }
            } else {
                // new char starts with count = 1
                st.push(new Pair(ch, 1));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Pair p : st) {
            for (int i = 0; i < p.count; i++) {
                sb.append(p.ch);
            }
        }
        return sb.toString();
    }

    
}
