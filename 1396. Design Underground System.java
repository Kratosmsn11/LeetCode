class UndergroundSystem {

    public final Map<Integer, Pair<String, Integer>> cust;
    Map<String, int[]> dist;

    public UndergroundSystem() {
        this.cust = new HashMap<>();
        this.dist = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        cust.put(id, new Pair(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> customer = this.cust.get(id);

        this.dist.putIfAbsent(customer.getKey() + "-" + stationName, new int[2]);

        int[] sum = this.dist.get(customer.getKey() + "-" + stationName);

        sum[0] += t - customer.getValue();
        sum[1]++;

        this.cust.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        int[] sum = this.dist.get(startStation + "-" + endStation);

        return (double) sum[0]/sum[1];
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
