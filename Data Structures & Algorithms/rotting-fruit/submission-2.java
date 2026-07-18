class Solution {
    public int rows;
    public int cols;
    public boolean[][] visit;
    public int orangesRotting(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int fresh = 0, time = 0;

        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(grid[r][c]==1) fresh++;
            }
        }

        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        while(fresh>0){
            boolean flag =false;
            for(int r=0; r<rows; r++){
                for(int c=0; c<cols; c++){
                    if(grid[r][c]==2){
                        for(int[] d: directions){
                            int row = r + d[0], col = c + d[1];
                            if(row>=0 && col>=0 && row<rows && col<cols && grid[row][col]==1){
                                grid[row][col] = 3;
                                fresh--;
                                flag=true;
                            }
                        }
                    }
                }
            }

            if(!flag) return -1;

            for(int r=0; r<rows; r++){
                for(int c=0; c<cols; c++){
                    if(grid[r][c]==3) grid[r][c]=2;
                }
            }
            time++;
        }
        return time;
    }
}
