class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        #defining mymap dictionary for hashset
        my_map = {}
        longest_array, sum = 0,0

        for i in range(len(nums)):

            #If binary value is 0 add -1 or +1 for 1 
            if nums[i] == 0:
                sum += -1
            else:
                sum += 1

            #If sum is 0 meaning the number of 1's and 0's are equal throughout the array so max length is length +1
            if sum == 0:
                longest_array = i+1
            
            #add the key value if sum not in map data structure
            else:
                if sum in my_map:
                    longest_array = max(longest_array,i - my_map[sum])
                else:
                    my_map[sum] = i

        return longest_array

#This problem of contiguous array for finding the longest subarray is performed using hashset with Time complexity = O(n) and space complexity O(n)