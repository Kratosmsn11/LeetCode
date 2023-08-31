class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
    
    /* 
       ex: let's say we have an array as [2, 2, 2, 2]
       index 0 : value = 2, freq = 0, good pair = 0;
       index 1 : value = 2, freq = 1, good pair = 1; 
       index 2 : value = 2, freq = 2, good pair = 1;
       index 3 : value = 2, freq = 3, good pair = 2;
    */
    for(int num : nums){
        int prevCount = map.getOrDefault(num,0);
        count += prevCount;
        map.put(num, prevCount + 1);
    }

    return count;
    }
}
