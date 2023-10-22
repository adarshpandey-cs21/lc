class Solution {
    public int maximumScore(int[] arr, int k) {
    Stack<Integer> st=new Stack<>();
        int max=0;
        for (int i = 0; i <arr.length ; i++) {

            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
             int r=i;
             int h=arr[st.pop()];
             if(r-1>=k){
             if(st.isEmpty()){
                 int a=h*r;
                 max=Math.max(a,max);
             }else{
                int l=st.peek();
                if(l+1<=k){
                int a=h*(r-l-1);
                max=Math.max(a,max);
                }
             }
             }
            }
            st.push(i);

        }
       int r=arr.length;
        while(!st.isEmpty()){
            
            int h=arr[st.pop()];
            if(r-1>=k){
            if(st.isEmpty()){
                int a=h*r;
                max=Math.max(max,a);

            }else{
                int l=st.peek();
                if(l+1<=k){
                int res=h*(r-l-1);
                max=Math.max(max,res);
                }
            }
            }
            
        }
        return max;
    }
}