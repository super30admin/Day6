# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dict_count = {0:1}
        subsum= count=0
        for i in nums:
            subsum+=i
            if subsum-k in dict_count:
                count += dict_count[subsum-k]
            if subsum not in dict_count:
                dict_count[subsum] = 0
            dict_count[subsum] +=1
        return count   
            
            
