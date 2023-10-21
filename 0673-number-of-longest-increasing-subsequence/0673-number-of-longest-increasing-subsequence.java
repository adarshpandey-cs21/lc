class Solution {
    public int findNumberOfLIS(int[] arr) {
     int x= arr.length;
        int []dp=new int[x];
        int []count=new int[x];
        Arrays.fill(dp,1);
        Arrays.fill(count,1);
        int max=1;
        for (int i = 0; i <x; i++) {
            for (int prev = 0; prev<i ; prev++) {
                if(arr[prev]<arr[i] && 1+dp[prev]>dp[i]){
                    dp[i]=1+dp[prev];
                    count[i]=count[prev];
                } else if(arr[prev]<arr[i] && 1+dp[prev]==dp[i]){
                    count[i]+=count[prev];
                }
            }
            max=Math.max(max,dp[i]);
        }
        int ans=0;
        for (int i = 0; i <x ; i++) {
            if (dp[i]==max){
                ans+=count[i];
            }
        }
        return ans;
    }
}
