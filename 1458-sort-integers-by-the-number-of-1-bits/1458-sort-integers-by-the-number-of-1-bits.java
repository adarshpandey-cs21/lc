class Solution {
    public int[] sortByBits(int[] arr) {
  newArr arr1[]=new newArr[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            int k=arr[i];
            int oC=0;
            while(k>0){
                if(k%2!=0){
                    oC++;
                }
                k/=2;
            }
             arr1[i]=new newArr(arr[i],oC);
           
            
        }
        Arrays.sort(arr1, new Comparator<newArr>() {
            @Override
            public int compare(newArr o1, newArr o2) {
                if(o1.count==o2.count) {
                      return o1.val-o2.val;
                   
                }
                 return o1.count - o2.count;
              
            }
        });
        for (int i = 0; i <arr1.length ; i++) {
            arr[i]=arr1[i].val;
        }
        return arr;
    }
    class newArr{
        int val;
        int count;
        public newArr(int val,int count){
            this.val=val;
            this.count=count;
        }
    }
}