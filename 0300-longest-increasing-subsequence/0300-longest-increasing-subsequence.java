class Solution {
    public int lengthOfLIS(int[] arr) {
      int n=arr.length;
        List<Integer> ll=new ArrayList<>();
        ll.add(arr[0]);
        for (int i = 1; i <n ; i++) {
            if(arr[i]>ll.get(ll.size()-1)){
                ll.add(arr[i]);
            }else{
                int idx= Collections.binarySearch(ll,arr[i]);
                if(idx<0){
                    idx=-idx-1;
                }
                ll.set(idx,arr[i]);
            }
        }
        return ll.size();
    }
}
