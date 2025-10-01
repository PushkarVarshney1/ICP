class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0; j<grid[0].length ; j++){
                if(grid[i][j] == '1'){
                    ans++;
                    fun(grid , i , j);
                }
            }
        }
        return ans;
    }
    public void fun(char [][]grid,int i ,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0') return ;
        grid[i][j] = '0';
        fun(grid ,i-1 ,j); // up
        fun(grid, i ,j+1); // right
        fun(grid, i+1 ,j); // down
        fun(grid, i ,j-1); // left
    }
}