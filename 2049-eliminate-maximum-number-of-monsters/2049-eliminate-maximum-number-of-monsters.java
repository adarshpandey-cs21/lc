class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
     int n=dist.length;
       int p[]=new int[n];
        for (int i = 0; i <n ; i++) {
            p[i]=(int)Math.ceil((double)dist[i]/speed[i]);
        }
        Arrays.sort(p);
        int count=0;

        for (int i = 0; i <n ; i++) {
            if(p[i]<=i) {
                return count;
            }
            count++;
        }
        return n;
    }
}