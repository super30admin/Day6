# Leetcode 560. Subarray Sum Equals K

# Time Complexity :  O(n) where n is the size of the array

# Space Complexity : O(n)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use a hashtable to store the cummulative sum at every index and its occurence count.
# If the difference between the cummulative sums at index is k, then the sum of sub array between those indices
# is k. Every time we find a index  such that (cummulative_sum -k) is in hashmap,we update the count by
# the its value in hashtable. This gives us the no. of possible sub arrays at every index that equals to k.

# Your code here along with comments explaining your approach

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashmap = dict()
        cummulative = 0
        count = 0
        hashmap[0] = 1
        for i in range(len(nums)):
            cummulative += nums[i]

            if (cummulative-k) in hashmap:
                count += hashmap[cummulative-k]

            if cummulative in hashmap:
                newCount = hashmap[cummulative]
                newCount += 1
                hashmap[cummulative] = newCount
            else:
                hashmap[cummulative] = 1
        return count
