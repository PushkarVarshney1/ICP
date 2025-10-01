class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Same intution as min arrow to burst ballons
        int n=intervals.length;
        if(n==1)return 0;
        Arrays.sort(intervals , new Comparator<int[]>(){
            public int compare(int[]a1 ,int[]a2){
                if(a1[0]==a2[0]) return 0;
                else if(a1[0]<a2[0]) return -1;
                return 1;
            }
        });
        int ans=0;
        int Edpoint=intervals[0][1];
        for(int i=1; i<n; i++){
            int st=intervals[i][0];
            int ed=intervals[i][1];
            if(st < Edpoint){
                ans++;
                Edpoint=Math.min(ed , Edpoint);
            }
            else{
                Edpoint=ed;
            }
            System.out.println(ans);
        }
        // 
        return ans;
    }
}