class Solution {
    public int numIslands(char[][] grid) {
  int m=grid.length;
        int n=grid[0].length;
        boolean [][]vis=new boolean[m][n];
        int count=0;
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n ; j++) {
                if(grid[i][j]=='1'&& vis[i][j]==false){
                    count++;
                    bfs(i,j,grid,vis);
                }
            }
        }
        return count;
    }
    public void bfs(int i,int j, char[][]grid,boolean[][]vis) {
        vis[i][j]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        while (!q.isEmpty()){
            Pair curr=q.poll();
            int row=curr.row;
            int col=curr.col;
            for (int k = 0; k <=3; k++) {
                    int nrow=row+dr[k];
                    int ncol=col+dc[k];
                    if(nrow>=0&&nrow< grid.length&&ncol>=0&&ncol< grid[0].length&&grid[nrow][ncol]=='1'&&vis[nrow][ncol]==false){
                        vis[nrow][ncol]=true;
                        q.add(new Pair(nrow,ncol));
                    }

            }

        }
    }
    class Pair{
        int row;
        int col;
        public Pair(int row ,int col){
            this.row=row;
            this.col=col;
        }
    }


}