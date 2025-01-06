# Time Complexity : O(n), where n is the number of elements in nums
# Space Complexity : O(n), where n is the number of elements in nums
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# - using a running sum with hash map approach
# - since its binary array we will do +1 for every 1 and -1 for every 0
# - goal is to return the max length of a continous sub array with equal number of 0s and 1s
# - so if we are doing -1 for 0 and +1 for 1, the running sum will become same after equal number of 0s and 1s
# - for the search operation if we saw this same running sum before, we will have to iterate over the list - linear search (brute force)
# - to optimize it, we are using hashing
# - since we want to return the length, we need an index related to a running sum, thats why we use a hashmap instead of a hash set
# - next, if we have seen a running sum before, we compute the max length
# - if not, we add the running sum and index to the hash map
# - now, we do not update the index value of a repeating running sum in the hash map because we want the longest length i,e, farthest index value


class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        if nums is None:
            return -1
        
        rsum = 0
        hmap = {}
        # base case - for cases like [0, 1] 0 should be seen in the hash map, so adding it at index -1
        hmap[0] = -1
        length = 0

        for i in range(len(nums)):
            # decrement for 0
            if nums[i] == 0:
                rsum -= 1
            else:
                # increment for 1
                rsum += 1
            
            if rsum in hmap:
                # if the new running some exists in the map
                # compare the new length value, if its greater, we update it
                if i - hmap[rsum] > length:
                    length = i - hmap[rsum]
            else:
                # else, we just add it in the hash map
                hmap[rsum] = i

        
        return length


        