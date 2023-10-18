class Solution {
    public int maxProfit(int[] arr) {
        
     int n = arr.length;
        int k=2;
        int dp[][][] = new int[n][2][k+1];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <2 ; j++) {
                for (int l = 0; l < k+1; l++) {
                    dp[i][j][l]=-1;
                }
            }
        }
       return maxProfitM(0,1,k,arr,dp);
    }
    public static int maxProfitM(int idx,int buy,int cap,int[] arr,int[][][]dp ) {
        if(cap==0){
            return 0;
        }
        if(idx== arr.length){
            return 0;
        }
        if(dp[idx][buy][cap]!=-1){
            return dp[idx][buy][cap];
        }
        if(buy==1){
            return dp[idx][buy][cap]=Math.max(-arr[idx]+maxProfitM(idx+1,0,cap,arr,dp),0+maxProfitM(idx+1,1,cap,arr,dp));
        }else{
            return dp[idx][buy][cap]=Math.max(arr[idx]+maxProfitM(idx+1,1,cap-1,arr,dp),0+maxProfitM(idx+1,0,cap,arr,dp));
        }
    }
}
