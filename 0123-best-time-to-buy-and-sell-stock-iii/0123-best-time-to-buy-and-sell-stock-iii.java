class Solution {
    public int maxProfit(int[] arr) {
        
     int n = arr.length;
        int k=2;
        int dp[][][] = new int[n+1][2][k+1];
        dp[0][0][k]=dp[0][1][k]=0;
        for (int idx = n-1; idx >=0 ; idx--) {
            for (int buy = 0; buy <=1 ; buy++) {
                for (int cap = k; cap >0 ; cap--) {
                    int profit=0;
                    if(buy==1){
                         profit=Math.max(-arr[idx]+dp[idx+1][0][cap],0+dp[idx+1][1][cap]);
                    }else{
                        profit=Math.max(arr[idx]+dp[idx+1][1][cap-1],0+dp[idx+1][0][cap]);
                    }
                    dp[idx][buy][cap]=profit;
                }
            }
        }
        return dp[0][1][k];
    }
}