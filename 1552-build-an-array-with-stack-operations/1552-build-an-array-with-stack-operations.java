class Solution {
    public List<String> buildArray(int[] arr, int n) {
    List<String> l=new ArrayList<>();
        Stack<Integer> st= new Stack<>();
        int idx=0;
        for (int i = 1; i <=n ; i++) {
            st.push(i);
            l.add("Push");
            if(!st.empty()&& st.peek()!=arr[idx]){
                st.pop();
                l.add("Pop");
            }else{
                idx++;
            }
            if(idx== arr.length){
                break;
            }
        }
        return l;
    }
}