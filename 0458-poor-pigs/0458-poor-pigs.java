class Solution {
    public int poorPigs(int buckets, int mD, int mT) {
        int max = mT / mD + 1;
        int ans = 0;
        while (Math.pow(max,ans) < buckets){
            ++ans;
        }
        return ans;
    }
}