class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        
    int n=dist.length;
        Pair [] p=new Pair[n];
        for (int i = 0; i <n ; i++) {
            p[i]=new Pair(dist[i],speed[i]);
        }
        Arrays.sort(p, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.tTimme-o2.tTimme;
            }
        });
        int count=1;
      int time=1;
        for (int i = 1; i <n ; i++) {
            if(p[i].tTimme-time==0) {
                return count;
            }
            count++;
            time++;
        }        
        return n;
    }

     class Pair{
        int dist;
        int tTimme=0;
        public  Pair(int dist,int speed){
            this.dist=dist;
            int k=(int)Math.ceil((double) dist/(double) speed);
            this.tTimme=k==0?1:k;
        }
    }
   
}