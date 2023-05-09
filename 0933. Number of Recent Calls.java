class RecentCounter {
    Queue<Integer> q = new LinkedList<Integer>();

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        q.add(t);
        while(!q.isEmpty() && q.peek() < t - 3000){
            q.remove();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
