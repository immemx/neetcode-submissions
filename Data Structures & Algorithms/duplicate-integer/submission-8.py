class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        trackedNums = {}
        
        for num in nums:
            if num in trackedNums:
                return True
            else:
                trackedNums[num] = 0
        
        return False
        