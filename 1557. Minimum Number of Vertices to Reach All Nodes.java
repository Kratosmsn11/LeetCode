class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
       boolean[] hasIncomingEdges = new boolean[n];
       for(List<Integer> edge: edges) hasIncomingEdges[edge.get(1)] = true;

       List<Integer> requiredNodes = new ArrayList<>();
       for(int i = 0; i < n; i++){
           if(!hasIncomingEdges[i]){
               requiredNodes.add(i);
           }
        }
        return requiredNodes; 
    }
}
