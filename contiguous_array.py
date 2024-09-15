# Time Complexity : O(N) where N is number of elements in the list
# Space Complexity : O(N) because hashmap will have to store N key count, index pairs in worst case
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findMaxLength(self, nums) -> int:
        hashmap = {0 : -1}
        maxlen, rcount = 0, 0
        
        for i in range(len(nums)):
            rcount += 1 if nums[i] == 1 else -1
            
            if rcount in hashmap:
                maxlen = max(maxlen, i - hashmap[rcount])
            else:
                hashmap[rcount] = i
            
        return maxlen


solution = Solution()
print(f'OUTPUT >> {solution.findMaxLength([0,1,0])}')
print(f'OUTPUT >> {solution.findMaxLength([0,1])}')