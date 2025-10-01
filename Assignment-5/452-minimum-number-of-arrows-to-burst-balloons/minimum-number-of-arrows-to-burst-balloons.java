class Solution {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        if(n==1)return 1;
        // sort by first element
        Arrays.sort(points , new Comparator<int[]>(){
            public int compare(int []a1,int []a2){
                if(a1[0] == a2[0])return 0;
                if(a1[0] < a2[0])return -1;
                return 1;
            }
        });
        int ans=1;
        int commonPoint = points[0][1];
        for(int i=1; i<points.length; i++){
            int st=points[i][0];
            int ed=points[i][1];
            if(st <= commonPoint){
                commonPoint = Math.min(commonPoint , ed);
            }
            else{
                ans++;
                commonPoint=ed;
            }
        }
        return ans;
    }
}