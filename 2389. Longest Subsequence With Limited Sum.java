class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];

        Arrays.sort(nums);

        for(int i = 0; i<queries.length; i++){
            int count = 0;
            long sum = 0;
            for(int j = 0; j<nums.length; j++){
                if(queries[i] >= sum + nums[j]){
                    sum += nums[j];
                    count++;
                }
                answer[i] = count;
            }
        }
        return answer;
    }
}
