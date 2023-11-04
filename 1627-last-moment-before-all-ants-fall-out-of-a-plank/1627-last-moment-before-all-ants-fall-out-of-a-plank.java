class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int l=0;
        for(int e:left){
            l=Math.max(l,e);
        }
        int r=0;
        for(int el:right){
            r=Math.max(r,n-el);
        }
        return Math.max(l,r);
    }
}