package leetcode75challenge;

public class LeetCode200 {

    public static void exploreIsland(char[][] grid,int row,int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length)
            return;
        if(grid[row][col] == '0')
            return;
        grid[row][col] = '0';
        exploreIsland(grid,row,col-1);
        exploreIsland(grid,row,col+1);
        exploreIsland(grid,row-1,col);
        exploreIsland(grid,row+1,col);

    }

    public static int numIslands(char[][] grid) {
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    res++;
                    exploreIsland(grid,i,j);
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.println("Number of Islands on the map are : " + numIslands(grid));
    }
}
