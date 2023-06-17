class Solution {
    public int kthFactor(int n, int k) {
        
        List<Integer> al = new ArrayList<>();
     
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                al.add(i);
                if(n % (n/i) == 0 && i != (n/i)){
                    al.add(n/i);
                }
            }
        }
      
        Collections.sort(al);
        if(al.size() >= k) return al.get(k-1);
        return -1;
    }
}
