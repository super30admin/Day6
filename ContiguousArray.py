#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : YES
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
