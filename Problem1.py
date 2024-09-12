class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count,total = 0,0
        dic = {0:1}
        for i in nums:       
            total += i
            if total-k in dic:
                count += dic[total - k]
            if total not in dic:
                dic[total] = 1
            else:
                dic[total] +=1 
        return count

#Time Complexity = O(n)
#Space Complexity = O(n)