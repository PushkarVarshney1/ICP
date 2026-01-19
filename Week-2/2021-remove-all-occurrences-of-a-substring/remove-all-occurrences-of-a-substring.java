class Solution {
    public String removeOccurrences(String s, String part) {
                    // Brute Force : TC -> O(n * m) and SC -> O(n) -> for string s

        // Use Stack , Removal of chars in the String for constant complexity to reduce TLE
        Stack<Character> st = new Stack<>(); 
        String temp =""; 
        int l = part.length()-1;
        
        for(int i=0; i<s.length(); i++){
            st.push(s.charAt(i));
            if(st.peek() == part.charAt(l) && fun(st,l,part)){
                for(int j = l; j>=0; j--){
                    st.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
    public boolean fun(Stack<Character>st , int idx,String part){
        Stack<Character> temp = new Stack<>();
        temp.addAll(st);
        for(int i = idx; i>=0; i--){
            if(temp.isEmpty() || temp.peek() != part.charAt(i))return false;
            temp.pop();
        }
        return true;
    }
}