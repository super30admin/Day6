# Time complexity: O(n)
# Space complexity: O(n)


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count,result = 0,0
        dic = {0: -1}
        for i in range(len(nums)):
            n = nums[i]
            if n == 0:
                count -= 1
            if n == 1:
                 count += 1

            if count in dic:                      
                 result = max(result, i - dic[count]) 
            else:                     
                 dic[count] = i  

        return result