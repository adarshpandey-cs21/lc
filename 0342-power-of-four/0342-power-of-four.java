class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0){
            return false;
        }
        double i = Math.log(n) / Math.log(4);
 
        return i == Math.floor(i);
    }
}