class Solution {
    public int numBusesToDestination(int[][] routes, int src, int des) {
    if(src ==des) {
        return 0;
    }

    HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for(int r = 0;r<routes.length;r++) {
        for (int stop : routes[r]) {
            ArrayList<Integer> route = hm.getOrDefault(stop, new ArrayList<>());
            route.add(r);
            hm.put(stop, route);
        }
    }

    Queue<Integer> q = new LinkedList<>();
    Set<Integer> visited = new HashSet<Integer>(routes.length);
    for(int route :hm.get(src)){
        q.add(route);
        visited.add(route);
    }

    int ans = 1;
    while(!q.isEmpty()) {
        int size = q.size();

        for (int i = 0; i < size; i++) {
            int route = q.remove();
            for (int stop : routes[route]) {
                if (stop == des) {
                    return ans;
                }

                for (int nextRoute : hm.get(stop)) {
                    if (!visited.contains(nextRoute)) {
                        visited.add(nextRoute);
                        q.add(nextRoute);
                    }
                }
            }
        }
        ans++;
    }
        return-1;
}
}