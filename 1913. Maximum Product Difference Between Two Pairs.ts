function maxProductDifference(nums: number[]): number {
    nums.sort((a,b) => a - b);

    const n = nums.length;
    const maxProd = nums[n - 1] * nums[n - 2];
    const minProd = nums[0] * nums[1];

    return maxProd - minProd;
};
