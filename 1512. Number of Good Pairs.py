class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        map = {}

        for num in nums:
            if num in map:
                count += map[num]
                map[num] += 1
            else:
                map[num] = 1

        return count
