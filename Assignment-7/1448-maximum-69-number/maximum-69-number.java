class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch=sb.charAt(i);
            if(ch == '6'){
                sb.deleteCharAt(i); 
                sb.insert(i,'9');
                break;
            }
        }
        String str = sb.toString();
        return Integer.parseInt(str);
    }
}