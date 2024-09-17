# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode :YES
# Any problem you faced while coding this :NO

class Solution:
    def findMaxLength(self, nums) -> int:
        hashmap = {} #key - running_sum, val - earliest index at which it occured
        hashmap[0] = -1
        rsum = 0
        maxlen = 0
        for i in range(len(nums)):
            if nums[i]==0:
                rsum-=1
            else:
                rsum+=1            
            if rsum in hashmap.keys():
                #len of cur balanced array
                curlen = i - hashmap[rsum]
                maxlen = max(maxlen,curlen)
            else:
                hashmap[rsum] = i
        return maxlen

obj = Solution()
arr = [0,1,0]

print(obj.findMaxLength(arr))
