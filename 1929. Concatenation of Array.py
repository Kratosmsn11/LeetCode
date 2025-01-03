class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        results = [0] * 2 * n

        for i in range(n):
            results[i] = nums[i]
            results[i+n] = nums[i]
        return results
