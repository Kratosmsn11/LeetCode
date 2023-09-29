class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr1){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(int num: arr2){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(int num: arr3){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for(Integer item: freq.keySet()){
            if(freq.get(item) == 3){
                result.add(item);
            }
        }

        return result;
    }
}
