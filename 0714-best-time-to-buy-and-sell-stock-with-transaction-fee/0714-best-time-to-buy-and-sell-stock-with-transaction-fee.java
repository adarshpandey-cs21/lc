class Solution {
    public int maxProfit(int[] arr, int fee) {
        int n=arr.length;
            int dp[][]=new int[n+1][2];
            dp[n][0]=dp[n][1]=0;
            for (int i = n-1; i >=0 ; i--) {
                for (int buy = 0; buy <=1 ; buy++) {
                    long profit=0;
                    if(buy==1){
                        profit= Math.max(-arr[i]+dp[i+1][0],0+dp[i+1][1]);
                    }else{
                        profit=Math.max(arr[i]-fee+dp[i+1][1],0+dp[i+1][0]);
                    }
                    dp[i][buy]=(int)profit;
                }
            }
            return dp[0][1];


        }
}