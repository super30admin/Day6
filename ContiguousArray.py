# Time Complexity: O(n); n is length of nums array
# Space Complexity:O(n); if all elements are different
# We find the running sum and if not already present in the add it, else compare difference of its value with current 
# solution with the map's value and update  max accordingly
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxLen = 0
        prefixMap = dict()
        prefixMap[0] = -1
        rSum = 0
        
        for i in range(len(nums)):
            if nums[i] == 1:
                rSum += 1
            else:
                rSum -= 1
            if rSum not in prefixMap:
                prefixMap[rSum] = i
            else:
                maxLen = max(i-prefixMap[rSum], maxLen)
        return maxLen
                
                
                
                
        
