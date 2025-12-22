class Solution {
    public String generateTag(String caption) {
        StringBuilder sb=new StringBuilder("#");
        caption=caption.trim();
        String[] arr=caption.split(" ");
        for(int i=0; i<arr.length; i++){
            String s=arr[i];
            if (s.isEmpty()) continue;
            char c=s.charAt(0);
            if(i==0){
                c=Character.toLowerCase(c);
            }
            else{
                c=Character.toUpperCase(c);
            }
            sb.append(c);
            sb.append(s.substring(1).toLowerCase());
        }
        String res=sb.toString();
        return res.length()>100 ? res.substring(0,100) : res;
    }
}