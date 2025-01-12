# Time - O(n)
# Space - O(n)
#---------------Running Sum approach eliminates the need for nested iteration****** (Refer notes for clarity)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        Map = {0: -1} # Running Sum is zero at index -1 Dummy index to not miss the array starting from the beginning
        rsum = 0
        Max = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum -= 1
            else:
                rsum += 1
            if rsum in Map:
                Max = max(Max, i - Map[rsum])
            else:
                Map[rsum] = i
        return Max