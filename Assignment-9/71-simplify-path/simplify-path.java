class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        if(arr.length==0)return "/";
        Stack<String> st=new Stack<>();
        for(String s:arr){
            if(s.equals("") || s.equals(" ") || s.equals("."))continue;
            if(s.equals("..")){
                if (!st.isEmpty()) {
                    st.pop();
                }
            } 
            else {
                st.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }
        System.out.print(sb);
        return sb.length() == 0 ? "/" : sb.toString();   
    }
}