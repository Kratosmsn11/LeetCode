function numIdenticalPairs(nums: number[]): number {
    // Time Complexity : O(n);
    // Space Complexity : O(n);
    let count = 0;
    let map = {};

    for(const num of nums){
        if(map[num]){
            count += map[num];
            map[num]++;
        }else{
            map[num] = 1
        }
    }

    return count;
};
