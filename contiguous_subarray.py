# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this :No
# initialise a dict, Max and Rsum variables
# loop over the array and dec the Rsum if 0 and inc Rsum if 1
# check if Rsum in map then find max between current Max and diff of i and value of Rsum in map
# else add Rsum to map 
# return Max (which hold the maximum length found.)
def findMaxLength(self, nums: List[int]) -> int:

    if len(nums) == 0:
        return 0
    Max=0
    map = dict()
    map[0] = -1
    Rsum = 0
    for i in range(len(nums)):
        if nums[i]==0:
            Rsum -= 1
        else:
            Rsum += 1
        if Rsum in map:
            Max = max(Max, i - map[Rsum])
        else:
            map[Rsum] = i
    return Max
