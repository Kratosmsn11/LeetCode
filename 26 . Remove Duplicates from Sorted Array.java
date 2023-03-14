class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i < nums.length; i++){
            if(al.contains(nums[i])){
                continue;
            }else{
                al.add(nums[i]);
            }
        }
        k = al.size();
        for(int i=0; i< al.size(); i++){
            nums[i] = al.get(i);
        }
        return k;
    }
}
