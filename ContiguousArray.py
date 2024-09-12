# Time Complexity : O(N)
# Space Complexity : O(N)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = {}
        hashmap[0] = -1
        maxlen = 0
        count = 0
        
        for i in range(len(nums)):
            if nums[i] == 1:
                count+=1
            else:
                count+=-1
            if count in hashmap:
                maxlen = max(maxlen, i - hashmap[count])
            else:
                hashmap[count] = i
        
        return maxlen