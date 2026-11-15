class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        # loop list and check if its coorepsonding num to target exists.
        comps = {}
        indexCounter = 0
        for num in nums:
            complement = target - num
            if complement in comps:
                return [comps[complement], indexCounter]
            else:
                comps[num] = indexCounter
                indexCounter += 1

        