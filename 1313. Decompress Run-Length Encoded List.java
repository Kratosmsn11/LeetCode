class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0; i<nums.length; i += 2){
            for(int j = 0; j<nums[i]; j++){
                l.add(nums[i+1]);
            }
        }

        int[] res = new int[l.size()];
        for(int i=0; i<l.size(); i++) res[i] = l.get(i);
               
        return res;
    }
}
