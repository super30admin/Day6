"""
Approach : Interate over the array and mainitain a map of running count and fixt index where it was seen 
Time compexity O(n)
Space Complexity O(n)

"""



class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        running_sum_map ={0:0}
        count = 0
        running_sum = 0 
        total = 0
        for i in nums:
            
            total += 1
            running_sum += 1 if i == 1 else -1

            if (running_sum_map.get(running_sum) != None) :
                count = max(count, total - running_sum_map[running_sum])
            
            if (running_sum_map.get(running_sum) == None) :
                running_sum_map[running_sum] = total
            
        return count
 
