class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l,r = 0, len(nums)-1

        while l <= r:
            middle_val,middle_ind = nums[(l+r)//2], (l+r)//2
            if target > middle_val:
                l=middle_ind+1
            elif target < middle_val:
                r=middle_ind-1
            else:
                return middle_ind
        return -1

