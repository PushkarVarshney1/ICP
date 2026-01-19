package Week1;

public class Find_the_Index_Of_the_First_Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
											// Brute Force
		String haystack = "sadbutsad";   // "a" , "leetcode"
		String needle = "sad";           // "a" , "leeto"
		System.out.println(find(haystack  , needle));
	}
	public static int find(String haystack, String needle) {
		int s = haystack.length();
        int targ = needle.length();
        for(int i=0; i<s; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int k = 1;
                for(int j=i+1; j<s && j<i+targ; j++){
                    if(haystack.charAt(j) != needle.charAt(k))break;
                    k++;
                }
                if(targ == k)
                return i;
            }
        }
        return -1;
        
//        									TC -> O(m *  n)
//        									SC -> O(1)
    }
	
	//  									Optimal
	public static int find2(String haystack , String needle) {
		return haystack.indexOf(needle);
	}
//							TC -> O(m *  n)
//							SC -> O(1)
	

}
