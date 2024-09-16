# Time Complexity: O(n)
# Space Complexity: O(n)
class Solution(object):
    def subarraySum(self, nums, k):
        dic = {}
        sm = 0
        dic[0] = 1
        ans = 0
        for i in nums:
            sm += i
            if sm-k in dic:
                ans += dic[sm-k]
            if sm not in dic:
                dic[sm] = 1
            else:
                dic[sm] += 1
        return ans
                
            
        
