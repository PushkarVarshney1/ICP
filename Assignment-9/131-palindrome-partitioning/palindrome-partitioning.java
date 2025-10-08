class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ll =new ArrayList<>();
        fun(s,0,ll,ans);
        return ans;
    }
    public void fun(String s,int st,List<String>ll,List<List<String>> ans){
        if(st == s.length()){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=st+1; i<=s.length(); i++){
            if(isPalindrome(st,i-1,s)){
                ll.add(s.substring(st, i));
                fun(s,i,ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public boolean isPalindrome(int i,int j,String s){
        if(s.length() == 1)return true;
        while(i<j){
            if(s.charAt(i) != s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}