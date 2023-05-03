class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
return Arrays.asList(getElement(nums1, nums2), getElement(nums2, nums1));    
}

    private List<Integer> getElement(int[] nums1, int[] nums2){
        Set<Integer> onlyInNums1 = new HashSet<>();

        Set<Integer> presentInNums2 = new HashSet<>();
        for(int num: nums2){
            presentInNums2.add(num);
        }

        for(int num: nums1){
            if(!presentInNums2.contains(num)){
                onlyInNums1.add(num);
            }
        }
        return new ArrayList<>(onlyInNums1);
    }
}
