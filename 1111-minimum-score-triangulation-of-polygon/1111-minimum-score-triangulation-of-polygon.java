class Solution {
    public int minScoreTriangulation(int[] arr) {

        int dp[][]=new int[arr.length][arr.length];
        for (int i = 0; i < arr.length ; i++) {
            Arrays.fill(dp[i],-1);
        }
        return mcm(arr,0, arr.length-1,dp);
    }
    public static int mcm(int []arr,int i,int j,int [][]dp){
        if(i+1==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for (int k = i+1; k <j ; k++) {
            int fs=mcm(arr,i,k,dp);
            int ss=mcm(arr,k,j,dp);
            int self=arr[i]*arr[j]*arr[k];
            ans=Math.min(ans,fs+ss+self);
        }
        return dp[i][j]=ans;
    }
}
