class SeatManager {
        PriorityQueue<Integer> pq;
        int size;
        public SeatManager(int n) {
            pq=new PriorityQueue<>();
            size=1;
        }

        public int reserve() {
            if(!pq.isEmpty()){
                return pq.poll();
            }
            return size++;
        }

        public void unreserve(int seatNumber) {
            pq.add(seatNumber);
        }
    }

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */