class Solution {
    public int countHomogenous(String s) {
           int mod=1000000007;
        long count=1;
        long sum=0;
        for (int i = 1; i <s.length() ; i++) {
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                sum=(sum+(count*(count+1))/2)%mod;
                count=1;
            }
        }
        int n=s.length();
    
            sum=(sum+(count*(count+1))/2)%mod;
        
        return (int)(sum%mod);
    }
}