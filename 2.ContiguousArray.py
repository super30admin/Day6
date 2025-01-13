"""
Time Complexity: 0(n)
Space: 0(n)

Approach: Running Sum
    1. Maintain a map to store (x) value i.e. rSum : index-where-it-occured-first
    2. Maintain rSum for the contiguous array i.e. (z)
    3. If you saw 1, +1 in rSum. If you saw 0, -1 in rSum
    4. Check rSum for array (z) occured previously in map (x)
        If YES --> 
            (x) will be map[rSum]
            (z) will be index i i.e. rSum where it occured
            (z) - (x) will give you size of balanced array which lies in b/w. 
            It will be from [x+1] index to [z] index
"""
class Solution:
    def __init__(self):

        # {(rSum):(index first saw that sum)}
        self.__runDict = {0 : -1} # rSum will be 0 at index -1 i.e. just start from behind
        self.__rSum = 0
        self.maxLen = 0

    def findMaxLength(self, nums: List[int]) -> int:

        for i in range(0,len(nums)):

            if nums[i] == 1:
                self.__rSum += 1

            else:
                self.__rSum -= 1

            # check if rSum happened in dict
            if self.__rSum in self.__runDict:
                currentLen = i - self.__runDict[self.__rSum]
                self.maxLen = max(self.maxLen, currentLen)
            else:
                # saw rSum for the first time
                self.__runDict[self.__rSum] = i # store the index aka x-index
        
        # end of for loop

        return self.maxLen    
        