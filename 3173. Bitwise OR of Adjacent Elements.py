class Solution:
    def orArray(self, nums: List[int]) -> List[int]:
        n = len(nums)-1
        answer = [0] * n

        for i in range(n):
            answer[i] = nums[i] | nums[i+1]
        return answer
