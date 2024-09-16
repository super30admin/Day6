# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach:
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        # To keep track of a cumulative sum in 'total' and of the maximum length in 'length'         
        total = 0
        length = 0
        
        # creating hashmap to track sum
        # In the hashmap here, we'll be storing the sum as key and index of first occurance of that sum as it's value
        hMap = {}
        
        # traverse through each element in given array
        for i in range(len(nums)):
        
            # when a zero is encountered, add -1; else, add 1 and maintain a cumulative total
            if nums[i] == 0:
                total -= 1
            else:
                total += 1
                
            # If a zero is encountered, directly return the full length of array till that index.
            # Meaning we have nullified the sum and till this point we have equal 1s and 0s
            if total == 0:
                length = i+1
            
            # If the sum is not in hashmap, enter key and its value/index, else compare the length with the difference of array from current index to the first encountered index for that sum and update length with the higher value. 
            if total not in hMap:
                hMap[total] = i
            else:
                length = max(length, i-hMap.get(total))
        
        # return the tracked length
        return length