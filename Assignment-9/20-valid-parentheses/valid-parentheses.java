class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n==1)return false;
        char ch=s.charAt(0);
        // if(ch == ')' || ch=='}' || ch==']')return false;
        Stack<Character> st=new Stack<>();

        for(int i=0; i<s.length(); i++){
            ch=s.charAt(i);
            if(ch == '(' || ch=='{' || ch=='[')st.push(ch);
            else{
                if(st.isEmpty())return false;
                else if(st.peek()=='(' && ch==')')st.pop();
                else if(st.peek()=='[' && ch==']')st.pop();
                else if(st.peek()=='{' && ch=='}')st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}