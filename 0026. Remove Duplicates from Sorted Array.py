class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j = 1
        for i in range(len(nums)-1):
            if nums[i] != nums[i+1]:
                nums[j] = nums[i+1]
                j += 1
        return j
