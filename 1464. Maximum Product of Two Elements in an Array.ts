function maxProduct(nums: number[]): number {
    nums.sort((a,b) => a - b);

    const n = nums.length;
    const prod1 = nums[n-1] - 1;
    const prod2 = nums[n-2] - 1;

    return prod1 * prod2;
};
