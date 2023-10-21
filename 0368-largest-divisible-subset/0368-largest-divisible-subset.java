class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        int x=arr.length;
   int []dp=new int[x];
        Arrays.fill(dp,1);
        int []print=new int[x];
        Arrays.sort(arr);

        for (int i = 0; i <x; i++) {
            print[i]=i;
            for (int prev = 0; prev<i ; prev++) {
                if(arr[i]%arr[prev]==0 && 1+dp[prev]>dp[i]){
                    dp[i]=1+dp[prev];
                    print[i]=prev;
                }
            }
        }
        int lidx=-1;
        int max=-1;
        for (int i = 0; i <x ; i++) {
            if(dp[i]>max){
                max=dp[i];
                lidx=i;
            }
        }
        List<Integer> ll=new ArrayList<>();
        ll.add(arr[lidx]);
        while (print[lidx]!=lidx){
            lidx=print[lidx];
            ll.add(arr[lidx]);
        }
        return ll;
    }
}
