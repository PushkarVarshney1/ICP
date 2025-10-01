class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // count of char inside s1
        int []freq1=new int[26];
        for(char ch : s1.toCharArray()){
            freq1[ch - 'a']++;
        }
        // Using sliding window concept
        int []freq2=new int[26];
        int wndSize=s1.length(); // Size of window to be checked
        for(int i=0; i<s2.length(); i++){
            char ch=s2.charAt(i);
            freq2[ch - 'a']++;
            // condition checks if index become greater than wndSize then reduce the count 
            if(i >= wndSize){
                freq2[s2.charAt(i-wndSize) - 'a']--;
            }
            // It returns when getting complete permutation
            if(Arrays.equals(freq1, freq2)){
                return true;
            }
        }
        return false;
    }
}