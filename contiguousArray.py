class Solution:
    #O(n) time and #O(n) space solution
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = {}
        rsum = 0
        maxval = 0
        hashmap[0] = -1
        print(hashmap)
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum = rsum - 1
            else:
                rsum = rsum + 1
                
            if rsum in hashmap:
                maxval = max(maxval, i - hashmap[rsum])
            else:
                hashmap[rsum] = i
        
        return maxval