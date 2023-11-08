class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx==fx && sy==fy && t==1 ){
            return false;
        }
        int diffx=Math.abs(fx-sx);
        int diffy=Math.abs(fy-sy);
     int dia=Math.min(diffx,diffy);
        int strt=Math.abs(diffx-diffy);
        
        if(dia+strt<=t){
            return true;
        }
        return false;
    }
}