# Time Complexity : O(n)
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefix = 0
        hashmap = {0:1}
        count = 0

        for n in nums :
            prefix = prefix+n
            if prefix-k in hashmap:
                count += hashmap[prefix-k]
            
            hashmap[prefix] = hashmap.get(prefix,0)+1

        return count

        