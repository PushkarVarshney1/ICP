class Solution{
    public class Number_of_Islands {
        public static void main(String[] args) {
            char[][] arr={{'1','1','1','1','0'},
                    {'1','1','0','1','0'},
                    {'1','1','0','0','0'},
                    {'0','0','0','0','0'}};
            System.out.println(numIslands(arr));
        }
        public static int numIslands(char[][] grid) {
            int c=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]=='1'){
                        c++;
                        helper(grid,i,j);
                    }
                }
            }
            return c;
        }
        private static void helper(char[][] grid,int i,int j){
            if(i>=grid.length || i<0 || j<0 || j>=grid[0].length || grid[i][j]=='0') return;
            grid[i][j]='0';
            helper(grid,i+1,j);
            helper(grid,i-1,j);
            helper(grid,i,j-1);
            helper(grid,i,j+1);
        }
    }
}