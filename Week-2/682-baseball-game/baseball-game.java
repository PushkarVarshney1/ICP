class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st= new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("D")){
                st.push(st.peek()*2);
            }
            else if(arr[i].equals("C")) st.pop();
            else if(arr[i].equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else{
                st.push(Integer.parseInt(arr[i])); // there must be an integer
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}