class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<Integer>();
        for(int n : nums1) s1.add(n);
        HashSet<Integer> s2 = new HashSet<Integer>();
        for(int n : nums2) s2.add(n);

        s1.retainAll(s2);

        int[] res = new int[s1.size()];
        int i = 0;
        for(int s: s1) res[i++] = s;
        return res;
    }
}
