#Time Complexity O (n)
#Space Complexity O (n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        data = dict()
        max_c = 0
        count = 0
        data[0]=1
        for x in range(len(nums)):
            max_c += nums[x]
            if max_c - k in data:
                count+= data[max_c-k]
            
            cc = 0
            if max_c in data:
                cc = data[max_c] +1
            else:
                cc = 1
            data[max_c] = cc
                    
        return count
            
                    
                

                

                        
            
        
            
        
        
        
