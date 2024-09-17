#525. Contiguous Array
"""
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Your code here along with comments explaining your approach
We will keep track of running sum. In dictionary, running sum with index is stored as (key : value)
for 0 weare doing -1 and for 1 we are doing +1.

So, if there are equal number of 0s and 1s, sum will be 0 if we know rsum (runing sum) till lets
say y position in array, and till position x rsum is already known,
where [1,2,....x,....y,....n] then, rsum between x and y is y-x.

And id y=x then all the elements in middle will be having equal number of 0s and 1s

While doing this problem, we will be calculating y. To get max sub array with rsum=0, we should be knowing
value of x, to do that, dictionary is used.
"""


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        d = dict()
        s = 0 #running sum
        d.update({0: -1}) #to get correct ans for rsum=0
        max_count = 0
        for i in range(0, len(nums)):

            #s increment for 1 and decrement for 0. Here we are calculating y
            if nums[i] == 0:
                s = s - 1
            else:
                s = s + 1

            # Storing y in dict so that it can late be used as x
            if s in d:
                #if rsum already in dict, we update max_count = max(current max_count, y-x)
                max_count = max(max_count, i - d.get(s))
            #if rsum not in dict, then we will add it along with index. to calculate y-x
            else:
                d.update({s: i})

        return max_count