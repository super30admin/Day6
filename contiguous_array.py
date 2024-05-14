# time complexity: O(n) traversing the array once
# space complexity: O(n)
# Approach: idea is that- the same running sum indices have equal counts of 1 and 0's
# store the running sums in hashmap. if we see a running sum that is already in hashmap,
# subtract the hashmap's value(first index of that running sum) with new index and compare it with max value
# if new difference is greater, update max. else dont do anything.
# return max


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        rsum = 0
        hashmap = dict()
        maxsum = 0
        hashmap[0] = -1
        for i in range(len(nums)):
            if nums[i] ==1:
                rsum = rsum + 1
            else:
                rsum = rsum - 1
            if rsum not in hashmap:
                hashmap[rsum]=i
            else:
                maxsum = max(maxsum, (i -(hashmap[rsum])))
        return maxsum
            
            
        
        