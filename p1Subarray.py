"""
Given an array of integers nums and an integer k, 
return the total number of continuous subarrays whose sum equals to k.

ex: Input: nums = [1,1,1], k = 2
    Output: 2

3 ways: 
a. Basic brute-force approach - for all sum[i,j] count how many times we saw k. O(n^3).
b. make use of prefix sum for the third for-loop above. O(n^2)

c.  Best: Remember the frequency of all prefix sums. O(n) time and O(n) memory.
sum to keep track of sum of all the elements so far. If we can find a prefix sum 
in the map for sum-k, it means we can form sum == k using the elements after the 
element corresponding to that prefix sum till the current element (included). 
Count all such sums at each element.

There is a special case like in the Solution2 when nums[x] == k that is current sum 
itself is equal to target without any subtractions. For this solution, we can either 
increment count by 1 whenever sum == k below or make an entry as a special case in our map
preSumFreq.put(0, 1) to cover those cases.
 Whenever the sums has increased by a value of k, we've found a subarray of sums=k.



Complexity
Time: O(N)
Space: O(N) hash can be oN in the worst case


"""

class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count = 0
        sums = 0
        d = dict()
        d[0] = 1
        
        for i in range(len(nums)):
            sums += nums[i]
            count += d.get(sums-k,0)
            d[sums] = d.get(sums,0) + 1
        
        return(count)