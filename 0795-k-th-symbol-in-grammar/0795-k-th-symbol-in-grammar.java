class Solution {
    public int kthGrammar(int n, int k) {
         if (n == 1) {
            return 0;
        }
        int plen = 1 << (n - 2);

        if (k <= plen) {
            return kthGrammar(n - 1, k);
        } else {
            int ans = kthGrammar(n - 1, k - plen);
            return ans == 1 ? 0 : 1;
        }
    }
}