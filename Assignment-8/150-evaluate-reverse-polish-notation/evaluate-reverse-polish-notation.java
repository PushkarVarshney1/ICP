class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(String s : tokens) {
			if (s.equals("+")) {
                int right = Integer.parseInt(st.pop());
				int left = Integer.parseInt(st.pop());
				st.push(Integer.toString(right + left));
			} 
            else if (s.equals("-")) {
                int right = Integer.parseInt(st.pop());
				int left = Integer.parseInt(st.pop());
				st.push(Integer.toString(-right + left));
			} 
            else if (s.equals("*")) {
                int right = Integer.parseInt(st.pop());
				int left = Integer.parseInt(st.pop());
				st.push(Integer.toString(right * left));
			} 
			else if (s.equals("/")) {
                int right = Integer.parseInt(st.pop());
				int left = Integer.parseInt(st.pop());
				st.push(Integer.toString(left / right));
			} 
            else {
                st.push(s);
            }
		}
		return Integer.parseInt(st.peek());
    }
}
    
