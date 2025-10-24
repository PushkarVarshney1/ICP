class Solution {
    public String removeKdigits(String num, int k) {
        // edge case
        if(k == num.length())return "0";
        
        Stack<Character> st = new Stack<>();
        int i =0;
        while(i<num.length()){
            //whenever meet a digit which is less than the previous digit, discard the previous one
            while(k>0 && !st.isEmpty() && st.peek() > num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }
        // corner case like "1111"
        while(k>0){
            st.pop();
            k--;            
        }

        // Stack is having answer but in reverse order
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        System.out.print(sb);
        //remove all the 0 at the head
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);

        return sb.toString();
    }
}