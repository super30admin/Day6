# Time Complexity : O(N) where N is number of elements in the list
# Space Complexity : O(N) because hashmap will have to store N key value pairs in worst case
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def subarraySum(self, nums, k: int) -> int:
        hashmap = {0:1}
        count, rsum = 0, 0
        
        for i in range(len(nums)):
            rsum += nums[i]
            
            if (rsum-k) in hashmap:
                count += hashmap[rsum-k]
            
            if rsum in hashmap:
                hashmap[rsum] += 1
            else:
                hashmap[rsum] = 1
        
        return count


solution = Solution()
print(f'OUTPUT >> {solution.subarraySum([1,1,1], 2)}')
print(f'OUTPUT >> {solution.subarraySum([1,2,3], 3)}')