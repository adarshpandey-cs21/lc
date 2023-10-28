class Solution {
    public int countVowelPermutation(int n) {
   long aCount[]=new long[n];
        long eCount[]=new long[n];
        long iCount[]=new long[n];
        long oCount[]=new long[n];
        long uCount[]=new long[n];

        aCount[0]=1;
        eCount[0]=1;
        iCount[0]=1;
        oCount[0]=1;
        uCount[0]=1;
        int mod=1000000007;
        for (int i = 1; i <n ; i++) {
            aCount[i]=(eCount[i-1]+uCount[i-1]+iCount[i-1])%mod;
            eCount[i]=(aCount[i-1]+iCount[i-1])%mod;
            iCount[i]=(eCount[i-1]+oCount[i-1])%mod;
            oCount[i]=(iCount[i-1])%mod;
            uCount[i]=(oCount[i-1]+iCount[i-1])%mod;


        }
        long ans=(aCount[n-1]+eCount[n-1]+iCount[n-1]+oCount[n-1]+uCount[n-1])%mod;
        return (int)ans;
    }
}