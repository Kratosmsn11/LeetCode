class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # define map
        map = {}

        # iterate through the elements in list
        for i in range(len(nums)):
            # calculate the complement
            complement = target - nums[i]

            # if the complement is in map return the value & the current index
            if complement in map:
                return [map[complement], i]
            # if not then add the element in map
            map[nums[i]] = i
        return null
