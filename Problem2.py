class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        max_l = 0
        r_sum = 0
        hashmap = {0:-1}
        
        for i in range(len(nums)):
            if nums[i] == 1:
                r_sum +=1
            else:
                r_sum -=1
            
            if r_sum not in hashmap:
                hashmap[r_sum] = i
            else:
                max_l = max(max_l,(i - hashmap[r_sum]))
  
        return max_l


#Time complexity and Space complexity both will be O(n) where n is the length of the array
#hashmap in the worst case scenario will take space equal to size of the array.
        
        