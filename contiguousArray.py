
"""
Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Time = O(N); N = number of elements in given array
Space = O(N)

Successfully executed in leetcode

Approach(Hashmap) ---

1. HashMap to store the entries in the form of (index, count).
2. Make the entry for a count whenever count is encountered first. Later use the correspoding index to find the length.
2. Update subarray_len if it's greater than previous length, return subarray_len at the end.

"""

class ContiguousArray:
    def findMaxLength(self, nums: List[int]) -> int:
        
        dictionary = {}
        subarr_len = 0
        count = 0
        
        for i in range(len(nums)):
            if nums[i] == 1:
                    count += 1
            else:
                count += -1
            
            if count == 0:
                subarr_len = i+ 1
            if count in dictionary :
                subarr_len = max(subarr_len,i-dictionary[count])
            else:
                dictionary[count] = i
            print(dictionary, subarr_len, "here")
        return subarr_len
                