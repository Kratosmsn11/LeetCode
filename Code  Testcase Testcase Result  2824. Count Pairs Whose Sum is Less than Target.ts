function countPairs(nums: number[], target: number): number {
    nums.sort((a,b) => a - b);

    let result : number = 0, start : number = 0, end : number = nums.length - 1;
    while(start < end){
        if(nums[start] + nums[end] < target){
            result += Math.abs(end - start);
;            start++;
        }else{
            end--;
        }
    }

    return result;
};
