class Solution {
    public boolean checkValidString(String s) {
        int a = 0; // open brackets
        int b = 0; // close brackets
        for(char ch:s.toCharArray()){
            if(ch == '('){
                a++;
                b++;
            }
            else if(ch == ')'){
                a--;
                b--;
            }
            else{
                a--;
                b++;
            }
            if(a<0)a=0;
            if(b<0)return false;
        }
        return a==0;
    }
}