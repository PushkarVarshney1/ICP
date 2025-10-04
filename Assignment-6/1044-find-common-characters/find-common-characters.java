class Solution {
    public List<String> commonChars(String[] words) {
        
        List<String> ll = new ArrayList<>();
        if(words.length ==1){
            for(char ch:words[0].toCharArray())ll.add(String.valueOf(ch));
        }
        for(int i=0; i<words[0].length();i++){
            char ch=words[0].charAt(i);
            int c=0;
            for(int j=1; j<words.length; j++){
                if(words[j].contains(""+ch)) {
                    c++;
                    words[j] = words[j].replaceFirst(String.valueOf(ch), "");  
                }
                if(c==words.length-1) ll.add(String.valueOf(ch));
            }
        }
        return ll;
    }
}