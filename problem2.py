#contiguous array
#SC: O(N)
#tc: O(N)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        aux = {0:-1} #count = key and value = index
        count = 0 
        max_len = 0
        for i in range(len(nums)):
            current = nums[i]
            if current == 0: # if 0 is encountered decrease the count
                count -=1
            else:
                count +=1 # if 1 is enocuntered increase 
            
            if count ==0: # when the count goes to 0 you have found an array
                max_len = i+1
            if count in aux:
                max_len = max(max_len,i-aux[count])
            else:
                aux[count]=i
        return max_len