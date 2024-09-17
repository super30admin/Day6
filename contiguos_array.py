# Time Complexity :
# O(N)  - Length of the arry

# Space Complexity :
# O(1) - the hasp map size has a max limit of 26

# Did this code successfully run on Leetcode :
#Yes

# Any problem you faced while coding this :
#No

#To find the lenght of the larget subarray with equal number of 0s and 1s,We find the length of each of the subarray that have equal 0s and 1s and find the max among them 
#We do this by keeping a running sum that captures how many 0s and 1s have been seen until now and every time a running sum repeats, it means all the elements from the previous time the current running sum was seen until now form a subarray.
# We keep checking if we find a longer contiguos array as we keep going through the list of numbers and store it if we find

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return 0
        count = 0
        map1 = {0:-1}
        result = 0
        for i,elem in enumerate(nums):
            if elem == 0 :
                count = count - 1
            else :
                count += 1
            if count in map1 :
                result = max(result,i-map1[count])
            else :
                map1[count] = i
        return result
