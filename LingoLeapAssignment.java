class LingoLeapAssignment {
    public static int maxMoves(int[][] grid) {
        int[][] arr =new int[grid.length][grid[0].length];
        arr[0][0]=0;
        int ans=0;
        for(int i=1;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[j][i-1]<grid[j][i]){
                    if(i==1 || arr[j][i-1]>0)arr[j][i]=Math.max(arr[j][i],1+arr[j][i-1]);
                }

                if(j-1>=0 && grid[j-1][i-1]<grid[j][i]){
                    if(i==1 || arr[j-1][i-1]>0)arr[j][i]=Math.max(arr[j][i],1+arr[j-1][i-1]);
                }

                if(j+1<grid.length && grid[j+1][i-1]<grid[j][i]){
                    if(i==1 || arr[j+1][i-1]>0) arr[j][i]=Math.max(arr[j][i],1+arr[j+1][i-1]);
                }

                ans=Math.max(ans,arr[j][i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid={{2,4,3,5},{5,4,9,3},{3,4,2,11},{10,9,13,15}};
        int[][] grid2={{3,2,4},{2,1,9},{1,1,7}};
        System.out.println(maxMoves(grid));
        System.out.println(maxMoves(grid2));
    }
}
