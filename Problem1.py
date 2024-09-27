#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : YES
#Any problem you faced while coding this : NO
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dic = {0:1}
        summ = 0
        count = 0
        for i in range(0,len(nums)):
            summ += nums[i]
            temp = summ - k
            if temp in dic:
                count += dic[temp]
                
            if summ not in dic:
                dic[summ] = 1
            else:
                dic[summ] += 1
            
        return count