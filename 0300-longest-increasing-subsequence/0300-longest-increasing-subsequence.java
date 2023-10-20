class Solution {
    public int lengthOfLIS(int[] arr) {
    int n=arr.length;
        int dp[][]=new int[n][n+1];
        for (int i = 0; i <n ; i++) {
            Arrays.fill(dp[i],-1);
        }
        return check(0,-1,arr,dp);
        
    }
    public static int check(int idx,int prev,int []arr,int dp[][]){
        if(idx==arr.length){
            return 0;
        }
        if(dp[idx][prev+1]!=-1){
            return dp[idx][prev+1];
        }
        int nPic=0+check(idx+1,prev,arr,dp);
        int pic=0;
        if(prev==-1||arr[idx]>arr[prev]){
            pic=1+check(idx+1,idx,arr,dp);
        }
        return dp[idx][prev+1]=Math.max(pic,nPic);
    }
    
}
