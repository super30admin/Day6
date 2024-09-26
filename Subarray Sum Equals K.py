# Time Complexity : O(N)
# Space Complexity : O(N)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Took time to come up with this solution

class Solution(object):
    def subarraySum(self, nums, k):
        
        count = 0
        cumm = 0
        Dict = {0:1}
        
        for i in nums:
            cumm += i
            print(cumm)
            
            if cumm-k in Dict:
                count += Dict[cumm-k]
            
            if cumm not in Dict:
                Dict[cumm] = 1
            else:
                Dict[cumm] += 1
            print(Dict)
            
        return count