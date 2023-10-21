class Solution {
    static Comparator<String> comp=(s1,s2)-> s1.length()-s2.length();
    public int longestStrChain(String[] arr) {
        
            List<String> l=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            l.add(arr[i]);
        }
        // Write your code here.
        int x= arr.length;
        int []dp=new int[x];
        Arrays.fill(dp,1);
        l.sort(comp);
        for (int i = 0; i <x; i++){
            for (int prev = 0; prev<i ; prev++) {
                if(isPossible(l.get(i),l.get(prev))&& 1+dp[prev]>dp[i]){
                    dp[i]=1+dp[prev];
                }
            }
        }

        int max=-1;
        for (int i = 0; i <x ; i++) {
            if(dp[i]>max){
                max=dp[i];

            }
        }
        return max;
    }
    public static boolean isPossible(String s1,String s2){
        if(s1.length()!=s2.length()+1){
            return false;
        }
        int i=0;
        int j=0;
        while (i<s1.length()){
            if(j<s2.length()&&s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return i==s1.length()&& j==s2.length();
    }
}
