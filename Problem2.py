class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxValue = total = 0
        dic = {}

        
        for idx,num in enumerate(nums):
            if num == 0:
                total+=1
            else:
                total-=1
            
            if total == 0:
                maxValue = idx+1
            else:
                if total not in dic:
                    dic[total] = idx
                else:
                    if idx - dic[total] > maxValue:
                        maxValue = idx - dic[total]
        return maxValue
    
    #Time complexity = O(n)
    #Space complexity = O(n)