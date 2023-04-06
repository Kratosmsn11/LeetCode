class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String ss = Arrays.toString(tempArray);

            List<String> tempList = group.get(ss);
            if(tempList == null){
                tempList = new ArrayList<>();
                group.put(ss, tempList);
            }
            tempList.add(strs[i]);
        }
        return new ArrayList<>(group.values());
    }
}
