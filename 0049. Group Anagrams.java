class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String ss = Arrays.toString(tempArray);
            if(group.containsKey(ss)){
                List<String> tempList = group.get(ss);
                tempList.add(strs[i]);
            }else{
                List<String> tempList = new ArrayList<>();
                tempList.add(strs[i]);
                group.put(ss, tempList);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<String, List<String>> e : group.entrySet()){
            res.add(e.getValue());
        }
        return res;
    }
}
