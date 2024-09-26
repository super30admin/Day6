class Solution:
    def findMin(self, nums: List[int]) -> int:
        
        if nums[0] <= nums[-1]:
            return nums[0]
        
        t = len(nums)      
        
        def searchMin(nums, l, r):
            m = l + int((r-l)/2)
            if m > 0 and nums[m-1] > nums[m]:
                return nums[m]
            if m < t and nums[m] > nums[m+1] :
                return nums[m+1]
            if nums[m] < nums[l]:
                return searchMin(nums, l, m-1)
            if nums[m] > nums[r]:
                return searchMin(nums, m+1, r)
            
        return searchMin(nums, 0, t-1)