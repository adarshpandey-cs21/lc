class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     int n=nums.length;
        // Code here
        // Arrays.sort(nums);
        
         HashMap<Integer,Integer> hm=new HashMap<>();
                for(int i=0;i<n;i++){
                    int num=nums[i];
                    hm.put(num,hm.getOrDefault(num,0)+1);
                }
                PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>(){
                    @Override
                    public int compare(Integer o1,Integer o2){
                        if(hm.get(o1) == hm.get(o2))
                            return o1-o2;
                        else
                            return hm.get(o1)-hm.get(o2);
                    }
                });


                List<Integer> ll=new ArrayList<>(hm.keySet());
                for(int i=0;i<k;i++)
                    pq.add(ll.get(i));

                for(int i=k;i<ll.size();i++){
                    if(hm.get(pq.peek()) <= hm.get(ll.get(i))){
                        pq.poll();
                        pq.add(ll.get(i));
                    }
                }


                int[] res=new int[k];
                for(int i=0;i<k;i++) {
                    res[i] = pq.poll();
                }
                
                return res;
    }
}