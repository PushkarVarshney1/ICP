class Solution {
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[] ans=spiralOrder(arr);
        System.out.println(Arrays.toString(ans));
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int minr=0 , maxr=matrix.length-1;
        int minc=0 , maxc=matrix[0].length-1;
        int total=matrix.length * matrix[0].length;
        Integer []ans=new Integer[total];
        int c=0;
        while(c<total){
            for(int i=minc;i<=maxc && c<total;i++){
                ans[c]=matrix[minr][i];
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr && c<total;i++){
                ans[c]=matrix[i][maxc];
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc && c<total;i--){
                ans[c]=matrix[maxr][i];
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr && c<total;i--){
                ans[c]=matrix[i][minc];
                c++;
            }
            minc++;
        }
        return Arrays.asList(ans);
    }
}